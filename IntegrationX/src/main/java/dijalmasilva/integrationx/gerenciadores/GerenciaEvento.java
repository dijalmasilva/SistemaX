/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.integrationx.gerenciadores;

import dijalmasilva.bussinessx.entidades.Evento;
import dijalmasilva.bussinessx.factory.CreateFactory;
import dijalmasilva.bussinessx.factory.Factory;
import dijalmasilva.bussinessx.interfaces.DaoEvento;
import java.util.List;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class GerenciaEvento {

    private final Factory fabrica = CreateFactory.createFactory();
    private final DaoEvento dao = fabrica.criarDaoEvento();
    
    public boolean salvar(Evento e){
        
        return dao.salvar(e);
    }
    
    public boolean remover(Evento e){
        return dao.remover(e);
    }
    
    public boolean atualizar(long id, Evento e){
        return dao.atualizar(id, e);
    }
    
    public Evento buscar(long id){
        return dao.buscar(id);
    }
    
    public List<Evento> todos(){
        return dao.todos();
    }
}
