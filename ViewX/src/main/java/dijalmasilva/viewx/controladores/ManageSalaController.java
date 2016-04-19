/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.viewx.controladores;

import dijalmasilva.bussinessx.entidades.Bloco;
import dijalmasilva.bussinessx.entidades.Sala;
import dijalmasilva.integrationx.gerenciadores.GerenciaBloco;
import dijalmasilva.integrationx.gerenciadores.GerenciaSala;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Controller
@RequestMapping(value = "/home/managerSala")
public class ManageSalaController {

    @RequestMapping("")
    public String managerSala(HttpServletRequest req) {
        GerenciaBloco gb = new GerenciaBloco();
        GerenciaSala gs = new GerenciaSala();
        req.getSession().setAttribute("blocos", gb.todos());
        req.getSession().setAttribute("rooms", gs.todos());
        return "gerenciadorSala";
    }

    @RequestMapping(value = {"/add"}, method = RequestMethod.POST)
    public String addSala(Sala s, String bloco, HttpServletRequest req) {
        GerenciaSala gs = new GerenciaSala();
        GerenciaBloco gb = new GerenciaBloco();
        Bloco b = gb.buscar(bloco);
        s.setBloco(b);
        boolean salvou = gs.salvar(s);
        if (salvou) {
            req.setAttribute("result", "Sala adicionada com sucesso!");
        } else {
            req.setAttribute("result", "Não foi possível adicionar a sala!");
        }
        return managerSala(req);
    }
}
