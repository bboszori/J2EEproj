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

    public EmpireRepository() {
    }


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
    
    public Empire getEmpireByID(long empireID) {
        Empire emp = em.find(Empire.class, empireID);
        return emp;
    }
    
        public void remove(Empire emp) {
        em.getTransaction().begin();
        em.remove(emp);
        em.getTransaction().commit();
    }

    public void update(Empire emp)
    {
        em.getTransaction().begin();
        em.merge(emp);
        em.getTransaction().commit();
    }
   
    
}
