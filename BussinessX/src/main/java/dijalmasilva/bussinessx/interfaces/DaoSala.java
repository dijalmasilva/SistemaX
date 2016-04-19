/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.bussinessx.interfaces;

import dijalmasilva.bussinessx.entidades.Sala;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public interface DaoSala {

    boolean salvar(Sala s);

    boolean remover(Sala s);

    boolean atualizar(long id, Sala s);

    Sala buscar(long id);

    List<Sala> todos();
}
