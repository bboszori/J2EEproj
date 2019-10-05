package hu.oe.hoe.adatok;

import java.util.ArrayList;
import java.util.List;

/**
 * @author javaee
 */
public class SpeciesRepository {
    
    
    public static final SpeciesRepository  instance = new SpeciesRepository();
    
    private List<Species> species = new ArrayList<>();

    public SpeciesRepository() {
        species.add(new Species("Ember", "okos"));
        species.add(new Species("Törpe", "kicsi"));
    }

    public List<Species> getSpecies() {
        return species;
    }
    
    
   
    
}
