package hu.oe.hoe.adatok;

import java.util.ArrayList;
import java.util.List;

/**
 * @author javaee
 */
public class EmpireRepository {
    
    private List<Empire> empires = new ArrayList<>();


    public List<Empire> getEmpires() {
        return empires;
    }
    
    public void add(Empire pvalue){empires.add(pvalue);}
   
    
}
