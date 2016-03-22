/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.integrationx.gerenciadores.main;

import dijalmasilva.bussinessx.entidades.Usuario;
import dijalmasilva.integrationx.gerenciadores.GerenciaUsuario;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class Loader {

    public static void main(String[] args) {
        GerenciaUsuario gu = new GerenciaUsuario();
        Usuario login = gu.login("Pipoca Man", "pipoca123");
        if (login != null){
            System.out.println("Logou!");
        }else{
            System.out.println("Não logou!");
        }
    }
}
