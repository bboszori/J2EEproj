package hu.oe.hoe.adatok;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author javaee
 */
@Entity
@Table(name = "hero")
public class Hero {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;
    String name, description;
    
    @OneToMany(cascade = CascadeType.ALL)
    List<Hybrid> hybrids = new ArrayList<>();
    
    @ManyToOne
    @JoinColumn(name="USER_ID")        
    User user;

    public Hero(String name, String description, ArrayList<Hybrid> hybrids, User user) {
        this.name = name;
        this.description = description;
        this.hybrids = hybrids;
        this.user = user;
    }

    public Hero(String name, String description, User user) {
        this.name = name;
        this.description = description;
        this.user = user;
    }


    public Hero() {
    }

    public List<Hybrid> getHybrid() {
        return hybrids;
    }

    public void setHybrid(List<Hybrid> hybrid) {
        this.hybrids = hybrid;
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
