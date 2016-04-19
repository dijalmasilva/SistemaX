/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.bussinessx.interfaces;

import dijalmasilva.bussinessx.entidades.Evento;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public interface DaoEvento {

    boolean salvar(Evento e);

    boolean remover(Evento e);

    boolean atualizar(long id, Evento e);

    Evento buscar(long id);

    List<Evento> todos();
}
