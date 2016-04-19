/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.viewx.controladores;

import dijalmasilva.integrationx.gerenciadores.GerenciaBloco;
import dijalmasilva.integrationx.gerenciadores.GerenciaSala;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Controller
@RequestMapping(value = "/home/managerSala")
public class ManageSalaController {

    @RequestMapping("")
    public String managerSala(HttpServletRequest req){
        GerenciaBloco gb = new GerenciaBloco();
        GerenciaSala gs = new GerenciaSala();
        req.getSession().setAttribute("blocos", gb.todos());
        req.getSession().setAttribute("salas", gs.todos());
        return "gerenciadorSala";
    }
}
