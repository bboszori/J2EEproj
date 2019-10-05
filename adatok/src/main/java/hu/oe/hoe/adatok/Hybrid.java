package hu.oe.hoe.adatok;

/**
 *
 * @author javaee
 */
public class Hybrid {
    private Species species;
    private byte percent;

    public Hybrid() {
    }

    public Hybrid(Species species, byte percent) {
        this.species = species;
        this.percent = percent;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public byte getPercent() {
        return percent;
    }

    public void setPercent(byte percent) {
        this.percent = percent;
    }
    
    
}
