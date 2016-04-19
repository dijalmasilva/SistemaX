/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.bussinessx.interfaces;

import dijalmasilva.bussinessx.entidades.Bloco;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public interface DaoBloco {

    boolean salvar(Bloco b);

    boolean remover(Bloco b);

    boolean atualizar(String nome, Bloco b);

    Bloco buscar(String nome);

    List<Bloco> todos();
}
