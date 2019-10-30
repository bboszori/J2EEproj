package hu.oe.hoe.adatok;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;



public class UserRepository {

    private EntityManager em = Persistence.createEntityManagerFactory("HeroPU").createEntityManager();
    private List<User> users = new ArrayList<>();

    public void add(User value){
        em.getTransaction().begin();
        em.persist(value);
        em.getTransaction().commit();
    
    }
    
    public User getByNamePassword(String pName, String pPassword){
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(User.class);
        Root root = cq.from(User.class);
        cq.where(cb.and(cb.equal(root.get("name"), pName), cb.equal(root.get("password"), pPassword)));
        return (User)em.createQuery(cq).getSingleResult();
    }
    
    public User getByName(String pName){
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(User.class);
        Root root = cq.from(User.class);
        cq.where(cb.equal(root.get("name"), pName));
        return (User)em.createQuery(cq).getSingleResult();
    }
    
    public List<Empire> getEmpByUserName(String pName){
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(User.class);
        Root root = cq.from(User.class);
        cq.where(cb.equal(root.get("name"), pName));
        return em.createQuery(cq).getResultList();
    }
    
    
    
    

    
}
