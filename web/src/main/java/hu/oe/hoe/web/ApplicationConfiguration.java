package hu.oe.hoe.web;

import hu.oe.hoe.adatok.EmpireRepository;
import hu.oe.hoe.adatok.HeroesRepository;
import hu.oe.hoe.adatok.Species;
import hu.oe.hoe.adatok.SpeciesRepository;
import hu.oe.hoe.adatok.UserRepository;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

@ApplicationScoped
public class ApplicationConfiguration {
    
    
    @Produces
    public UserRepository createUserRepository(){
        UserRepository ur = new UserRepository();
            
        try{
            ur.registration("a", "a");
            ur.registration("b", "n");
        }
        catch(Exception e){e.printStackTrace();}
        
        return ur;
    }
    
    @Produces
    public SpeciesRepository createSpeciesRepository(){
        SpeciesRepository sr = new SpeciesRepository();
            
        try{
            sr.add(new Species("Ember", "okos"));
            sr.add(new Species("Törpe", "kicsi"));
        }
        catch(Exception e){e.printStackTrace();}
        
        return sr;
    }
    
    @Produces
    public HeroesRepository createHeroesRepository(){
        HeroesRepository hr = new HeroesRepository();
            
        return hr;
    }
    
    @Produces
    public EmpireRepository createEmpireRepository(){
        EmpireRepository er = new EmpireRepository();
            
        return er;
    }
    
}
