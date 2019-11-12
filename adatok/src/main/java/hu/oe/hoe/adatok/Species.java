package hu.oe.hoe.adatok;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author javaee
 */
@Entity
@Table(name = "species")
public class Species {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;
    private String name, description;


    public Species(String name, String description) {
        this.name = name;
        this.description = description;

    }

    public Species() {
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
