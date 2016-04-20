/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.viewx.controladores;

import dijalmasilva.bussinessx.entidades.Material;
import dijalmasilva.integrationx.gerenciadores.GerenciaMaterial;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Controller
@RequestMapping("/home/managerMaterial")
public class ManageMaterialController {

    @RequestMapping("")
    public String managerMaterial(HttpServletRequest req){
        GerenciaMaterial gm = new GerenciaMaterial();
        req.getSession().setAttribute("materials", gm.todos());
        return "gerenciadorMaterial";
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addMaterial(Material m, HttpServletRequest req){
        GerenciaMaterial gm = new GerenciaMaterial();
        boolean salvou = gm.salvar(m);
        if (salvou){
            req.setAttribute("result", "Material salvo com sucesso!");
        }
        
        return managerMaterial(req);
    }
}
