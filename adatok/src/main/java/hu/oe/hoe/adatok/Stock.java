package hu.oe.hoe.adatok;

public class Stock {
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
