/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.bussinessx.interfaces;

import dijalmasilva.bussinessx.entidades.Feriado;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public interface DaoFeriado {
 
    boolean salvar(Feriado f);
    
    boolean remover(Feriado f);
    
    boolean atualizar(Long id, Feriado f);
    
    Feriado buscar(Long id);
    
    List<Feriado> todos();
}
