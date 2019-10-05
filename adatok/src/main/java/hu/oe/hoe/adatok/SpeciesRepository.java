package hu.oe.hoe.adatok;

import java.util.ArrayList;
import java.util.List;

/**
 * @author javaee
 */
public class SpeciesRepository {
    
    private List<Species> species = new ArrayList<>();


    public List<Species> getSpecies() {
        return species;
    }
    
    public void add(Species pvalue){species.add(pvalue);}
   
    
}
