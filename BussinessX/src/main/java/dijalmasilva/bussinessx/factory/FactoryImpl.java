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
import dijalmasilva.bussinessx.jpa.DaoBlocoImpl;
import dijalmasilva.bussinessx.jpa.DaoEventoImpl;
import dijalmasilva.bussinessx.jpa.DaoFeriadoImpl;
import dijalmasilva.bussinessx.jpa.DaoMaterialImpl;
import dijalmasilva.bussinessx.jpa.DaoSalaImpl;
import dijalmasilva.bussinessx.jpa.DaoUsuarioImpl;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class FactoryImpl implements Factory{

    @Override
    public DaoUsuario criarDaoUsuario() {
        return new DaoUsuarioImpl();
    }

    @Override
    public DaoFeriado criarDaoFeriado() {
        return new DaoFeriadoImpl();
    }

    @Override
    public DaoBloco criarDaoBloco() {
        return new DaoBlocoImpl();
    }

    @Override
    public DaoEvento criarDaoEvento() {
        return new DaoEventoImpl();
    }

    @Override
    public DaoSala criarDaoSala() {
        return new DaoSalaImpl();
    }

    @Override
    public DaoMaterial criarDaoMaterial() {
        return new DaoMaterialImpl();
    }

    
}
