package hu.oe.hoe.adatok;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author javaee
 */
public class Hero {
    private String name, description;
    private List<Hybrid> hybrid = new ArrayList<>();
    private User user;


    public Hero(String name, String description) {
        this.name = name;
        this.description = description;

    }

    public Hero() {
    }

    public List<Hybrid> getHybrid() {
        return hybrid;
    }

    public void setHybrid(List<Hybrid> hybrid) {
        this.hybrid = hybrid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

     
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
}
