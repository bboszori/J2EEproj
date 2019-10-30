
package hu.oe.hoe.web;

import hu.oe.hoe.adatok.Empire;
import hu.oe.hoe.adatok.EmpireRepository;
import hu.oe.hoe.adatok.Stock;
import hu.oe.hoe.adatok.User;
import hu.oe.hoe.adatok.UserRepository;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;

@Stateless
public class EmpireService {
    private EntityManager em = Persistence.createEntityManagerFactory("HeroPU").createEntityManager();
    
    @Inject
    EmpireRepository empiresRepository;
    
     @Inject
    UserRepository userRepository;
    
    public Empire add(Empire pemp){
        byte sum = 0;
        if (pemp != null && pemp.getStocks() != null) {
            for (Stock h:pemp.getStocks()) {
                sum +=  h.getCount();
            }
        }
        
        empiresRepository.add(pemp);
        return pemp;
        
    }
    
    public List<Empire> getByNameUser(String pName, User pUser){
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(User.class);
        Root root = cq.from(User.class);
        cq.where(cb.and(cb.equal(root.get("name"), pName), cb.equal(root.get("user"), pUser)));
        return em.createQuery(cq).getResultList();
    }
    
    public Empire getEmpByName(String pName){
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(User.class);
        Root root = cq.from(User.class);
        cq.where(cb.like(root.get("name"), "%" + pName + "%"));
        return (Empire)em.createQuery(cq).getSingleResult();
    }
    
    public Empire getEmpByDesc(String pdesc){
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(User.class);
        Root root = cq.from(User.class);
        cq.where(cb.like(root.get("description"), "%" + pdesc + "%"));
        return (Empire)em.createQuery(cq).getSingleResult();
    }
}
