/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.bussinessx.jpa;

import dijalmasilva.bussinessx.entidades.Sala;
import dijalmasilva.bussinessx.interfaces.DaoSala;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class DaoSalaImpl implements DaoSala{

    private final EntityManagerFactory factory = Persistence.createEntityManagerFactory("SistemaX");
    private final EntityManager em = factory.createEntityManager();
    
    @Override
    public boolean salvar(Sala s) {
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public boolean remover(Sala s) {
        em.getTransaction().begin();
        em.remove(em.merge(s));
        em.getTransaction().commit();
        return true;
    }

    @Override
    public boolean atualizar(long id, Sala s) {
        Sala find = em.find(Sala.class, id);
        find = s;
        em.getTransaction().begin();
        em.merge(find);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public Sala buscar(long id) {
        return em.find(Sala.class, id);
    }

    @Override
    public List<Sala> todos() {
        TypedQuery<Sala> query = em.createQuery("SELECT s FROM Sala s", Sala.class);
        return query.getResultList();
    }

}
