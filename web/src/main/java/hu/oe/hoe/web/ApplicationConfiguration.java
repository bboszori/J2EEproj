package hu.oe.hoe.web;

import hu.oe.hoe.adatok.AssetRepository;
import hu.oe.hoe.adatok.EmpireRepository;
import hu.oe.hoe.adatok.HeroesRepository;
import hu.oe.hoe.adatok.Species;
import hu.oe.hoe.adatok.SpeciesRepository;
import hu.oe.hoe.adatok.User;
import hu.oe.hoe.adatok.UserRepository;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

@ApplicationScoped
public class ApplicationConfiguration {
    
    
    @Produces
    public UserRepository createUserRepository(){
        UserRepository ur = new UserRepository();
            
        try{
            ur.add(new User("a", "a", false));
            ur.add(new User("b", "n", false));
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
    
    @Produces
    public AssetRepository createAssetRepository(){
        AssetRepository ar = new AssetRepository();
            
        return ar;
    }
    
}
