/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.bussinessx.jpa;

import dijalmasilva.bussinessx.entidades.Evento;
import dijalmasilva.bussinessx.interfaces.DaoEvento;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class DaoEventoImpl implements DaoEvento{

    private final EntityManagerFactory factory = Persistence.createEntityManagerFactory("SistemaX");
    private final EntityManager em = factory.createEntityManager();
    
    @Override
    public boolean salvar(Evento e) {
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public boolean remover(Evento e) {
        em.getTransaction().begin();
        em.remove(em.merge(e));
        em.getTransaction().commit();
        return true;
    }

    @Override
    public boolean atualizar(long id, Evento e) {
        Evento find = em.find(Evento.class, id);
        find = e;
        em.getTransaction().begin();
        em.merge(find);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public Evento buscar(long id) {
        return em.find(Evento.class, id);
    }

    @Override
    public List<Evento> todos() {
        TypedQuery<Evento> query = em.createQuery("SELECT e FROM Evento e", Evento.class);
        return query.getResultList();
    }

}
