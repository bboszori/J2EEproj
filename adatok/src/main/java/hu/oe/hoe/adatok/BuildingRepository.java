
package hu.oe.hoe.adatok;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public class BuildingRepository {
    private EntityManager em = Persistence.createEntityManagerFactory("HeroPU").createEntityManager();
    private List<Building> buildings = new ArrayList<>();

    public BuildingRepository() {
    }

    public List<Building> getbuildings() {
        return em.createQuery("SELECT s FROM building s", Building.class).getResultList();
    }
    
    public void add(Building value){
        em.getTransaction().begin();
        em.persist(value);
        em.getTransaction().commit();
    
    }
    
    public User getBuildingByID(long pID){
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(User.class);
        Root root = cq.from(User.class);
        cq.where(cb.equal(root.get("ID"), pID));
        return (User)em.createQuery(cq).getSingleResult();
    }
    
    public List<Empire> getBuildingByName(String pName){
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(User.class);
        Root root = cq.from(User.class);
        cq.where(cb.equal(root.get("name"), pName));
        return em.createQuery(cq).getResultList();
    }

}
