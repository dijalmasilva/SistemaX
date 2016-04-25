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
        Bloco b = gb.buscarPorNome(bloco);
        s.setBloco(b);
        boolean salvou = gs.salvar(s);
        if (salvou) {
            req.setAttribute("result", "Sala adicionada com sucesso!");
        } else {
            req.setAttribute("result", "Não foi possível adicionar a sala!");
        }
        return managerSala(req);
    }
    
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String editarSala(Sala s, String bloco, long id, HttpServletRequest req){
        GerenciaSala gs = new GerenciaSala();
        GerenciaBloco gb = new GerenciaBloco();
        Bloco b = gb.buscarPorNome(bloco);
        s.setBloco(b);
        boolean atualizou = gs.atualizar(id, s);
        if (atualizou){
            req.setAttribute("result", "Sala editada com sucesso!");
        }else{
            req.setAttribute("result", "Não foi possível editar a sala!");
        }
        
        return managerSala(req);
    }
    
    @RequestMapping(value = {"/remove"}, method = RequestMethod.POST)
    public String removeBloco (long id , HttpServletRequest req){
        System.out.println(id);
        GerenciaSala gs = new GerenciaSala();        
        
        Sala sala = gs.buscar(id);        
        boolean remover = gs.remover(sala);
        
        if(remover){
            req.setAttribute("resus", "Sala removida com Sucesso");            
        }else {
           req.setAttribute("result", "Erro ao remover sala");            
        }
        
        return managerSala(req);
    }
}
