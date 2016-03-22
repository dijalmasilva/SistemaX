/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.viewx.controladores;

import dijalmasilva.bussinessx.entidades.Usuario;
import dijalmasilva.integrationx.gerenciadores.GerenciaUsuario;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Controller
@RequestMapping("/index")
public class SessionController {
    
    @RequestMapping("")
    public String home(){
        return "index";
    }
    
    @RequestMapping(value = "/logar", method = RequestMethod.POST)
    public void login(String login, String senha, HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        GerenciaUsuario gu = new GerenciaUsuario();
        Usuario usuario = gu.login(login, senha);
        if (usuario != null){
            req.getSession().setAttribute("usuario", usuario);
            req.getRequestDispatcher("/home").forward(req, res);
        }else{
            req.setAttribute("result", "Nome de usuário ou senha inválidos!");
            req.getRequestDispatcher("/index").forward(req, res);
        }
    }
    
    @RequestMapping(value = "/logout")
    public void logout(HttpServletRequest req, HttpServletResponse res) throws IOException{
        req.getSession().invalidate();
        res.sendRedirect("/index");
    }
}
