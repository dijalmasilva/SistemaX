/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.viewx.controladores;

import dijalmasilva.bussinessx.entidades.Bloco;
import dijalmasilva.integrationx.gerenciadores.GerenciaBloco;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Controller
@RequestMapping("/home/managerBloco")
public class ManageBlocoController {

    @RequestMapping("")
    public String managerBloco(HttpServletRequest req){
        GerenciaBloco gb = new GerenciaBloco();
        List<Bloco> blocos = gb.todos();
        req.getSession().setAttribute("blocos", blocos);
        return "gerenciadorBloco";
    }
    
    @RequestMapping(value = {"/add"}, method = RequestMethod.POST)
    public String novoBloco(Bloco bloco, HttpServletRequest req){
        GerenciaBloco gb = new GerenciaBloco();
        boolean salvou = gb.salvarBloco(bloco);
        if (salvou){
            req.setAttribute("result", "Bloco adicionado com sucesso!");
        }else{
            req.setAttribute("result", "Não foi possível adicionar esse bloco!");
        }
        
        return managerBloco(req);
    }
}
