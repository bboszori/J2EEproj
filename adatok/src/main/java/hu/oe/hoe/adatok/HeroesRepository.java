package hu.oe.hoe.adatok;

import java.util.ArrayList;
import java.util.List;

/**
 * @author javaee
 */
public class HeroesRepository {
    
    private List<Hero> heroes = new ArrayList<>();


    public List<Hero> getHeroes() {
        return heroes;
    }
    
    public void add(Hero pvalue){heroes.add(pvalue);}
   
    
}
