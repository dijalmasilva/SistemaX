/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.viewx.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Controller
@RequestMapping("/home/alocarSala")
public class ManagerLocacaoSala {

    public String alocarSala(){
        return "alocarSalas";
    }
}