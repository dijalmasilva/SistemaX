/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.integrationx.gerenciadores;

import dijalmasilva.bussinessx.entidades.Material;
import dijalmasilva.bussinessx.enums.TypeStatus;
import dijalmasilva.bussinessx.factory.CreateFactory;
import dijalmasilva.bussinessx.factory.Factory;
import dijalmasilva.bussinessx.interfaces.DaoMaterial;
import java.util.List;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class GerenciaMaterial {

    private final Factory fabrica = CreateFactory.createFactory();
    private final DaoMaterial dao = fabrica.criarDaoMaterial();
    
    public boolean salvar(Material m){
        m.setStatus(TypeStatus.DISPONIVEL);
        boolean result = false;
        
        for (int i = 0; i < m.getQuantidade(); i++){
            result = dao.salvar(m);
            if (!result)
                break;
            m.setTombamento(0);
        }
        
        return result;
    }
    
    public boolean remove(Material m){
        return dao.remover(m);
    }
    
    public Material buscar(long tombamento){
        return dao.buscar(tombamento);
    }
    
    public boolean atualizar(long tombamento, Material m){
        return dao.atualizar(tombamento, m);
    }
    
    public List<Material> todos(){
        return dao.todos();
    }
}
