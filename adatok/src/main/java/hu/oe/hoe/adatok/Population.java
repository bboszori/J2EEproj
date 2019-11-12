package hu.oe.hoe.adatok;

public class Population {
    private People people;
    private int count;

    public Population(People people, int count) {
        this.people = people;
        this.count = count;
    }
    public Population() {
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    
}
