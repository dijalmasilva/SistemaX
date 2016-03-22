/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.integrationx.gerenciadores;

import dijalmasilva.bussinessx.entidades.Usuario;
import dijalmasilva.bussinessx.factory.CreateFactory;
import dijalmasilva.bussinessx.factory.Factory;
import dijalmasilva.bussinessx.interfaces.DaoUsuario;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class GerenciaUsuario {

    public boolean salvar(Usuario u) {
        Factory factory = CreateFactory.createFactory();
        DaoUsuario dao = factory.criarDaoUsuario();
        return dao.salvar(u);
    }

    public boolean remover(Usuario u) {
        Factory factory = CreateFactory.createFactory();
        DaoUsuario dao = factory.criarDaoUsuario();
        return dao.remover(u);
    }

    public Usuario buscar(Long id) {
        Factory factory = CreateFactory.createFactory();
        DaoUsuario dao = factory.criarDaoUsuario();
        return dao.buscar(id);
    }

    public List<Usuario> todos() {
        Factory factory = CreateFactory.createFactory();
        DaoUsuario dao = factory.criarDaoUsuario();
        return dao.todos();
    }

    public List<Usuario> todosAdministradores() {
        Factory factory = CreateFactory.createFactory();
        DaoUsuario dao = factory.criarDaoUsuario();
        return dao.todosAdministradores();
    }

    public List<Usuario> todosAlunos() {
        Factory factory = CreateFactory.createFactory();
        DaoUsuario dao = factory.criarDaoUsuario();
        return dao.todosAlunos();
    }

    public List<Usuario> todosAssistentes() {
        Factory factory = CreateFactory.createFactory();
        DaoUsuario dao = factory.criarDaoUsuario();
        return dao.todosAssistentes();
    }

    public List<Usuario> todosMonitores() {
        Factory factory = CreateFactory.createFactory();
        DaoUsuario dao = factory.criarDaoUsuario();
        return dao.todosMonitores();
    }

    public List<Usuario> todosProfessores() {
        Factory factory = CreateFactory.createFactory();
        DaoUsuario dao = factory.criarDaoUsuario();
        return dao.todosProfessores();
    }

    public boolean atualizar(Long id, Usuario u) {
        Factory factory = CreateFactory.createFactory();
        DaoUsuario dao = factory.criarDaoUsuario();
        return dao.atualizar(id, u);
    }

    public Usuario login(String login, String senha) {
        Factory factory = CreateFactory.createFactory();
        DaoUsuario dao = factory.criarDaoUsuario();

        Usuario u = dao.buscarByEmail(login);
        if (u == null) {
            u = dao.buscarByNome(login);
        }

        if (u != null) {
            if (u.getSenha().equals(senha)) {
                return u;
            }
        }

        return null;
    }
}
