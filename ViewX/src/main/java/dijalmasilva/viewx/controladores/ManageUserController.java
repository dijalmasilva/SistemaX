/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.viewx.controladores;

import dijalmasilva.bussinessx.entidades.Usuario;
import dijalmasilva.bussinessx.enums.UserType;
import dijalmasilva.integrationx.gerenciadores.GerenciaUsuario;
import dijalmasilva.viewx.entidades_form.UsuarioForm;
import java.io.File;
import java.io.IOException;
import java.util.List;
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
@RequestMapping("/home/manageUser")
public class ManageUserController {

    @RequestMapping("")
    public String manageUser(HttpServletRequest req) {
        GerenciaUsuario gu = new GerenciaUsuario();
        List<Usuario> todos = gu.todos();
        req.getSession().setAttribute("users", todos);

        return "gerenciadorUsuario";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void novoUsuario(UsuarioForm u, HttpServletRequest req, HttpServletResponse res, MultipartFile foto) throws ServletException, IOException {
        GerenciaUsuario gu = new GerenciaUsuario();

        Usuario usuario = new Usuario(u.getEmail(), u.getNome(), u.getSenha(), foto.getBytes(), u.getTipo(), u.getMatricula());
        boolean salvou = gu.salvar(usuario);
        if (salvou) {
            req.setAttribute("result", "Usuário cadastrado com sucesso!");
        } else {
            req.setAttribute("result", "Erro ao cadastrar usuário!");
        }

        req.getRequestDispatcher("/home/manageUser").forward(req, res);
    }

    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    public void removerUsuario(Long id, HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        GerenciaUsuario gu = new GerenciaUsuario();
        Usuario buscar = gu.buscar(id);
        boolean removeu = gu.remover(buscar);
        if (removeu) {
            req.setAttribute("result", "Usuário removido com sucesso!");
        } else {
            req.setAttribute("result", "Erro ao remover usuário!");
        }

        req.getRequestDispatcher("/home/manageUser").forward(req, res);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public void editarUsuario(Long id, UsuarioForm u, HttpServletRequest req, HttpServletResponse resp, MultipartFile foto) throws IOException {
        GerenciaUsuario gu = new GerenciaUsuario();
        Usuario usuario = new Usuario(id, u.getEmail(), u.getNome(), u.getSenha(), null, u.getTipo(), u.getMatricula());
        if (!foto.isEmpty()) {
            usuario.setFoto(foto.getBytes());
        }
        boolean atualizou = gu.atualizar(usuario.getId(), usuario);
        if (atualizou) {
            req.setAttribute("result", "Usuário editado com sucesso!");
        } else {
            req.setAttribute("result", "Erro ao editar usuário!");
        }
    }

    @RequestMapping(value = {"/editUsuarios"}, method = RequestMethod.POST)
    public String editarUsuarios(long id, String nome, String senha, String email, String matricula, UserType tipo,
            HttpServletRequest req) {
        GerenciaUsuario gu = new GerenciaUsuario();
        Usuario usuario = new Usuario(id, email, nome, senha, tipo, matricula);
        boolean atualizou = gu.atualizar(usuario.getId(), usuario);
        if (atualizou) {
            req.setAttribute("result", "Usuário editado com sucesso!");
        } else {
            req.setAttribute("result", "Erro ao editar usuário!");
        }
        return manageUser(req);

    }
}
