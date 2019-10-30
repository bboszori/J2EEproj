package hu.oe.hoe.adatok;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class AssetRepository {
    //public static final AssetRepository  instance = new AssetRepository();
    
    private EntityManager em = Persistence.createEntityManagerFactory("HeroPU").createEntityManager();
    private List<Asset> assets = new ArrayList<>();

    public AssetRepository() {
    }

    public List<Asset> getAssets() {
        return assets;
    }
    
    public void add(Asset value){
        em.getTransaction().begin();
        em.persist(value);
        em.getTransaction().commit();
    
    }

}
