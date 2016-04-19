/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.viewx.controladores;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Controller
@RequestMapping("/home/managerMaterial")
public class ManageMaterialController {

    @RequestMapping("")
    public String managerMaterial(HttpServletRequest req){
        return "gerenciadorMaterial";
    }
}
