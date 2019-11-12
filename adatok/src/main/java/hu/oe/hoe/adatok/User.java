package hu.oe.hoe.adatok;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
    
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    private long ID;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }
    private String name, password;
    private boolean admin;
    
    @OneToMany(mappedBy = "user")
    private List<Hero> heroes = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Empire> empires = new ArrayList<>();
    

    public User(String name, String password, boolean admin) {
        this.empires = new ArrayList<>();
        this.name = name;
        this.password = password;
        this.admin = admin;
    }

    public User() {
        this.empires = new ArrayList<>();
    }

    public List<Hero> getHero() {
        return heroes;
    }

    public void setHero(List<Hero> hero) {
        this.heroes = hero;
    }

    public List<Empire> getEmpire() {
        return empires;
    }

    public void setEmpire(List<Empire> empire) {
        this.empires = empire;
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
