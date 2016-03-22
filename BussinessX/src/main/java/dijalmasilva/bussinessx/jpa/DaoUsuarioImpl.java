/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.bussinessx.jpa;

import dijalmasilva.bussinessx.entidades.Usuario;
import dijalmasilva.bussinessx.interfaces.DaoUsuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class DaoUsuarioImpl implements DaoUsuario {

    private final EntityManagerFactory factory;
    private final EntityManager em;

    public DaoUsuarioImpl() {
        this.factory = Persistence.createEntityManagerFactory("SistemaX");
        this.em = factory.createEntityManager();
    }

    @Override
    public boolean salvar(Usuario u) {
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public boolean remover(Usuario u) {
        em.getTransaction().begin();
        em.remove(em.merge(u));
        em.getTransaction().commit();
        return true;
    }

    @Override
    public Usuario buscar(Long id) {
        return em.find(Usuario.class, id);
    }

    @Override
    public List<Usuario> todosAlunos() {
        Query query = em.createNativeQuery("select * from Usuario where tipo = 'ALUNO'", Usuario.class);
        return query.getResultList();
    }

    @Override
    public List<Usuario> todosMonitores() {
        Query query = em.createNativeQuery("select * from Usuario where tipo = 'MONITOR'", Usuario.class);
        return query.getResultList();
    }

    @Override
    public List<Usuario> todosAssistentes() {
        Query query = em.createNativeQuery("select * from Usuario where tipo = 'ASSISTENTE_DE_SALA'", Usuario.class);
        return query.getResultList();
    }

    @Override
    public List<Usuario> todosProfessores() {
        Query query = em.createNativeQuery("select * from Usuario where tipo = 'PROFESSOR'", Usuario.class);
        return query.getResultList();
    }

    @Override
    public List<Usuario> todosAdministradores() {
        Query query = em.createNativeQuery("select * from Usuario where tipo = 'ADMINISTRADOR'", Usuario.class);
        return query.getResultList();
    }

    @Override
    public List<Usuario> todos() {
        Query query = em.createNativeQuery("select * from Usuario", Usuario.class);
        return query.getResultList();
    }

    @Override
    public boolean atualizar(Long id, Usuario u) {
        Usuario usuario = buscar(id);
        usuario = u;
        em.getTransaction().begin();
        em.merge(usuario);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public Usuario buscarByEmail(String email) {

        try {
            Query query = em.createQuery("SELECT U FROM Usuario U where U.email = :email", Usuario.class);
            query.setParameter("email", email);
            return (Usuario) query.getSingleResult();

        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public Usuario buscarByNome(String nome) {
        try {
            Query query = em.createQuery("SELECT U FROM Usuario U where U.nome LIKE :nome", Usuario.class);
            query.setParameter("nome", nome);
            return (Usuario) query.getSingleResult();
        } catch (Exception ex) {
            return null;
        }
    }

}
