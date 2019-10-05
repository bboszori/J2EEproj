package hu.oe.hoe.adatok;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Empire {
    private String name;
    private List<Stock> stocks = new ArrayList<>();
    private List<Population> populations = new ArrayList<>();
    
    private final AssetRepository assetRepo = new AssetRepository();
    private final PeopleRepository peopleRepo = new PeopleRepository();
    
    public Empire(String name) {
        this.name = name;
       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }

    public List<Population> getPopulations() {
        return populations;
    }

    public void setPopulations(List<Population> populations) {
        this.populations = populations;
    }
    
    


}
