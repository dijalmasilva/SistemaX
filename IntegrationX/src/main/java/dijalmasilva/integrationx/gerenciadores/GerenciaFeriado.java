/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.integrationx.gerenciadores;

import dijalmasilva.bussinessx.entidades.Feriado;
import dijalmasilva.bussinessx.factory.CreateFactory;
import dijalmasilva.bussinessx.factory.Factory;
import dijalmasilva.bussinessx.interfaces.DaoFeriado;
import java.util.List;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class GerenciaFeriado {

    public boolean salvar(Feriado f){
        Factory factory = CreateFactory.createFactory();
        DaoFeriado dao = factory.criarDaoFeriado();
        return dao.salvar(f);
    }
    
    public boolean remover(Feriado f){
        Factory factory = CreateFactory.createFactory();
        DaoFeriado dao = factory.criarDaoFeriado();
        return dao.remover(f);
    }
    
    public Feriado buscar(Long id){
        Factory factory = CreateFactory.createFactory();
        DaoFeriado dao = factory.criarDaoFeriado();
        return dao.buscar(id);
    }
    
    public List<Feriado> todos(){
        Factory factory = CreateFactory.createFactory();
        DaoFeriado dao = factory.criarDaoFeriado();
        return dao.todos();
    }
    
     public boolean atualizar(Long id, Feriado f){
        Factory factory = CreateFactory.createFactory();
        DaoFeriado dao = factory.criarDaoFeriado();
        return dao.atualizar(id, f);
    }
}