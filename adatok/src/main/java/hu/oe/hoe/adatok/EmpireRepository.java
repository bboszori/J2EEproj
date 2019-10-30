package hu.oe.hoe.adatok;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * @author javaee
 */

public class EmpireRepository {
    
    private EntityManager em = Persistence.createEntityManagerFactory("HeroPU").createEntityManager();
    private List<Empire> empires = new ArrayList<>();


    public List<Empire> getEmpires() {
        return em.createQuery("SELECT s FROM empire s", Empire.class).getResultList();
    }
    
    public void add(Empire pvalue){
        em.getTransaction().begin();
        for (Stock h:pvalue.getStocks()) {
            em.persist(h);
        }
        em.persist(pvalue);
        em.getTransaction().commit();
    }
   
    
}
