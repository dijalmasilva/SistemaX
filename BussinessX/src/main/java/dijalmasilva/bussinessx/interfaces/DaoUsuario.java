/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.bussinessx.interfaces;

import dijalmasilva.bussinessx.entidades.Usuario;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public interface DaoUsuario {

    boolean salvar(Usuario u);
    
    boolean remover(Usuario u);
    
    Usuario buscar(Long id);

    Usuario buscarByEmail(String email);

    Usuario buscarByNome(String nome);
    
    List<Usuario> todosAlunos();
    
    List<Usuario> todosMonitores();
    
    List<Usuario> todosAssistentes();
    
    List<Usuario> todosProfessores();
    
    List<Usuario> todosAdministradores();
    
    List<Usuario> todos();
    
    boolean atualizar(Long id, Usuario u);
}
