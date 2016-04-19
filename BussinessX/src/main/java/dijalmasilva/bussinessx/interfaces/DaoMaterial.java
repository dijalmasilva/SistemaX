/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.bussinessx.interfaces;

import dijalmasilva.bussinessx.entidades.Material;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public interface DaoMaterial {

    boolean salvar(Material m);
    
    boolean remover(Material m);
    
    boolean atualizar(long tombamento, Material m);
    
    Material buscar(long tombamento);
    
    List<Material> todos();    
}
