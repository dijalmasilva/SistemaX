/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.viewx.controladores;

import dijalmasilva.bussinessx.entidades.Usuario;
import dijalmasilva.integrationx.gerenciadores.GerenciaUsuario;
import dijalmasilva.viewx.entidades_form.UsuarioForm;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("")
    public String home(){
        return "home";
    }
    
    @RequestMapping("/image/{id}")
    public void carregaImagem(@PathVariable Long id, HttpServletResponse resp){
        ServletOutputStream out = null;
        try {
            GerenciaUsuario gu = new GerenciaUsuario();
            Usuario usuario = gu.buscar(id);
            out = resp.getOutputStream();
            out.write(usuario.getFoto());
            out.flush();
        } catch (IOException ex) {
            Logger.getLogger(ManageUserController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(ManageUserController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @RequestMapping(value = "/editProfile", method = RequestMethod.POST)
    public String editarPerfil(UsuarioForm u, HttpServletRequest req, MultipartFile foto, HttpServletResponse resp) throws IOException, ServletException{
        Usuario usuario = (Usuario) req.getSession().getAttribute("usuario");
        usuario.setNome(u.getNome());
        usuario.setSenha(u.getSenha());
        
        if (foto.getSize() != 0){
            usuario.setFoto(foto.getBytes());
        }
        
        GerenciaUsuario gu = new GerenciaUsuario();
        boolean atualizou = gu.atualizar(usuario.getId(), usuario);
        if (atualizou){
            req.setAttribute("result", "Perfil atualizado com sucesso!");
        }else{
            req.setAttribute("result", "Não foi possível atualizar o seu perfil!");
        }
        
        return "home";
    }
}
