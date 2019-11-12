package hu.oe.hoe.adatok;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * @author javaee
 */
public class SpeciesRepository {
    
    private EntityManager em = Persistence.createEntityManagerFactory("heroesPU").createEntityManager();


    public List<Species> getSpecies() {
        return em.createQuery("SELECT s FROM Species s", Species.class).getResultList();
    }

    public void add(Species s) {
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();
    }
   
    
}
