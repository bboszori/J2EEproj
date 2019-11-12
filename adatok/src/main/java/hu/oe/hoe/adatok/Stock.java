package hu.oe.hoe.adatok;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="stock")
public class Stock {
    
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    private long ID;

    public Stock() {
    }
    

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }
    
    private Asset asset;
    private int count;

    public Stock(Asset asset, int count) {
        this.asset = asset;
        this.count = count;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    
}
