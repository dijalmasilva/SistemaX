/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.integrationx.gerenciadores;

import dijalmasilva.bussinessx.entidades.Bloco;
import dijalmasilva.bussinessx.factory.CreateFactory;
import dijalmasilva.bussinessx.factory.Factory;
import dijalmasilva.bussinessx.interfaces.DaoBloco;
import java.util.List;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class GerenciaBloco {

    private final Factory fabrica = CreateFactory.createFactory();
    private final DaoBloco dao = fabrica.criarDaoBloco();
    
    public boolean salvarBloco(Bloco b){
        return dao.salvar(b);
    }
    
    public boolean remover(Bloco b){
        return dao.remover(b);
    }
    
    public boolean atualizar(Bloco b){
        return dao.atualizar(b.getNome(), b);
    }
    
    public Bloco buscar(String nome){
        return dao.buscar(nome);
    }
    
    public List<Bloco> todos(){
        return dao.todos();
    }
}
