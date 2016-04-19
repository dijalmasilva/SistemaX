/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.bussinessx.factory;

import dijalmasilva.bussinessx.interfaces.DaoBloco;
import dijalmasilva.bussinessx.interfaces.DaoEvento;
import dijalmasilva.bussinessx.interfaces.DaoFeriado;
import dijalmasilva.bussinessx.interfaces.DaoMaterial;
import dijalmasilva.bussinessx.interfaces.DaoSala;
import dijalmasilva.bussinessx.interfaces.DaoUsuario;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public interface Factory {

    DaoUsuario criarDaoUsuario();
    
    DaoFeriado criarDaoFeriado();
    
    DaoBloco criarDaoBloco();
    
    DaoEvento criarDaoEvento();
    
    DaoSala criarDaoSala();
    
    DaoMaterial criarDaoMaterial();
}
