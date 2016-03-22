/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.bussinessx.jpa;

import dijalmasilva.bussinessx.entidades.Feriado;
import dijalmasilva.bussinessx.interfaces.DaoFeriado;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class DaoFeriadoImpl implements DaoFeriado {

    private final EntityManagerFactory factory;
    private final EntityManager em;

    public DaoFeriadoImpl() {
        this.factory = Persistence.createEntityManagerFactory("SistemaX");
        this.em = factory.createEntityManager();
    }

    @Override
    public boolean salvar(Feriado f) {
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public boolean remover(Feriado f) {
        em.getTransaction().begin();
        em.remove(em.merge(f));
        em.getTransaction().commit();
        return true;
    }

    @Override
    public Feriado buscar(Long id) {
        return em.find(Feriado.class, id);
    }

    @Override
    public List<Feriado> todos() {
        Query query = em.createNativeQuery("select * from Feriado", Feriado.class);
        return query.getResultList();
    }

    @Override
    public boolean atualizar(Long id, Feriado f) {
        Feriado feriado = buscar(id);
        feriado = f;
        em.getTransaction().begin();
        em.merge(feriado);
        em.getTransaction().commit();
        return true;
    }

}
