package hu.oe.hoe.adatok;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class AssetRepository {
    //public static final AssetRepository  instance = new AssetRepository();
    
    private EntityManager em = Persistence.createEntityManagerFactory("HeroPU").createEntityManager();
    private List<Asset> assets = new ArrayList<>();

    public AssetRepository() {
    }

    public List<Asset> getAssets() {
        return em.createQuery("SELECT s FROM asset s", Asset.class).getResultList();
    }
    
    public void add(Asset value){
        em.getTransaction().begin();
        em.persist(value);
        em.getTransaction().commit();
    
    }
    
    public User getAssetByID(long pID){
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(User.class);
        Root root = cq.from(User.class);
        cq.where(cb.equal(root.get("ID"), pID));
        return (User)em.createQuery(cq).getSingleResult();
    }
    
    public List<Empire> getAssetByName(String pName){
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(User.class);
        Root root = cq.from(User.class);
        cq.where(cb.equal(root.get("name"), pName));
        return em.createQuery(cq).getResultList();
    }

}
