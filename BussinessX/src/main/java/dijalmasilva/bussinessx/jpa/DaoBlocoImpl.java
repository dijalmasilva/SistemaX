/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.bussinessx.jpa;

import dijalmasilva.bussinessx.entidades.Bloco;
import dijalmasilva.bussinessx.interfaces.DaoBloco;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class DaoBlocoImpl implements DaoBloco{

    private final EntityManagerFactory factory = Persistence.createEntityManagerFactory("SistemaX");
    private final EntityManager em = factory.createEntityManager();
    
    @Override
    public boolean salvar(Bloco b) {
        em.getTransaction().begin();
        em.persist(b);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public boolean remover(Bloco b) {
        em.getTransaction().begin();
        em.remove(em.merge(b));
        em.getTransaction().commit();
        return true;
    }

    @Override
    public boolean atualizar(String nome, Bloco b) {
        Bloco finded = em.find(Bloco.class, nome);
        finded = b;
        em.merge(finded);
        return true;
    }

    @Override
    public Bloco buscar(String nome) {
        return em.find(Bloco.class, nome);
    }

    @Override
    public List<Bloco> todos() {
        TypedQuery<Bloco> query = em.createQuery("SELECT b FROM Bloco b", Bloco.class);
        return query.getResultList();
    }
}
