package hu.oe.hoe.adatok;

import java.util.ArrayList;
import java.util.List;

public class PeopleRepository {
    public static final PeopleRepository  instance = new PeopleRepository();
    
    private List<People> people = new ArrayList<>();

    public PeopleRepository() {
        people.add(new People("katona", "harcol"));
        people.add(new People("Földműves", "földet művel"));
    }

    public List<People> getPeople() {
        return people;
    }
}
