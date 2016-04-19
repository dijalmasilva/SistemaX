/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.bussinessx.jpa;

import dijalmasilva.bussinessx.entidades.Material;
import dijalmasilva.bussinessx.interfaces.DaoMaterial;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class DaoMaterialImpl implements DaoMaterial {

    private final EntityManagerFactory factory = Persistence.createEntityManagerFactory("SistemaX");
    private EntityManager em = factory.createEntityManager();

    @Override
    public boolean salvar(Material m) {
        em.getTransaction().begin();
        em.persist(m);
        em.getTransaction().commit();
        em.close();
        em = factory.createEntityManager();
        return true;
    }

    @Override
    public boolean remover(Material m) {
        em.getTransaction().begin();
        em.remove(em.merge(m));
        em.getTransaction().commit();
        return true;
    }

    @Override
    public boolean atualizar(long tombamento, Material m) {
        Material finded = em.find(Material.class, tombamento);
        finded = m;
        em.merge(finded);
        return true;
    }

    @Override
    public Material buscar(long tombamento) {
        return em.find(Material.class, tombamento);
    }

    @Override
    public List<Material> todos() {
        TypedQuery<Material> query = em.createQuery("SELECT m FROM Material m", Material.class);
        return query.getResultList();
    }

}
