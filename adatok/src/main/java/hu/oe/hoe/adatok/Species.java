package hu.oe.hoe.adatok;

/**
 *
 * @author javaee
 */
public class Species {
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
