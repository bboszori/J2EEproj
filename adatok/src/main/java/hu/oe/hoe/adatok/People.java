package hu.oe.hoe.adatok;

public class People {
    private String name, description;

    public People(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    public People() {
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
