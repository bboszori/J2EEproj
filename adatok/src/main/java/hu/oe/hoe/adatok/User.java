package hu.oe.hoe.adatok;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author javaee
 */
public class User {
    private String name, password;
    private boolean admin;
    private List<Hero> hero = new ArrayList<>();
    private List<Empire> empire = new ArrayList<>();
    

    public User(String name, String password, boolean admin) {
        this.name = name;
        this.password = password;
        this.admin = admin;
    }

    public User() {
    }

    public List<Hero> getHero() {
        return hero;
    }

    public void setHero(List<Hero> hero) {
        this.hero = hero;
    }

    public List<Empire> getEmpire() {
        return empire;
    }

    public void setEmpire(List<Empire> empire) {
        this.empire = empire;
    }

     
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
    
    
}
