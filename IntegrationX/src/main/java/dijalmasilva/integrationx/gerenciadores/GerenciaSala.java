/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.integrationx.gerenciadores;

import dijalmasilva.bussinessx.entidades.Sala;
import dijalmasilva.bussinessx.factory.CreateFactory;
import dijalmasilva.bussinessx.factory.Factory;
import dijalmasilva.bussinessx.interfaces.DaoSala;
import java.util.List;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class GerenciaSala {

    private final Factory fabrica = CreateFactory.createFactory();
    private final DaoSala dao = fabrica.criarDaoSala();
    
    public boolean salvar(Sala s){
        return dao.salvar(s);
    }
    
    public boolean remover(Sala s){
        return dao.remover(s);
    }
    
    public boolean atualizar(long id, Sala s){
        return dao.atualizar(id, s);
    }
    
    public Sala buscar(long id){
        return dao.buscar(id);
    }
    
    public List<Sala> todos(){
        return dao.todos();
    }
}
