package ch.bbw.ja.cluedo.datamodel;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

/**
 * author: Julian Aschwanden
 */
public class DataService {
    private List<Person> people;

    public DataService(){
        people = new ArrayList<>();
        loadObject();
    }

    private void loadObject(){
        people.add(new Person("Colonel Sanders", 55, "Billionaire", 1.78, "White goatee", "Red"));
        people.add(new Person("Isabella Rodriguez", 38, "Tech Entrepreneur", 1.65, "Bold Purple Hair", "Teal"));
        people.add(new Person("Dr. Malik Khan", 42, "Neuroscientist", 1.82, "Round Glasses", "Cobalt Blue"));
        people.add(new Person("Sophia Chen", 29, "Award-Winning Chef", 1.70, "Sleeve of Tattoos", "Deep Burgundy"));
        people.add(new Person("Jackson O'Malley", 47, "Bestselling Author", 1.88, "Salt-and-Pepper Beard", "Midnight Black"));
        people.add(new Person("Aisha Patel", 34, "Environmental Activist", 1.63, "Nose Piercing", "Forest Green"));
        people.add(new Person("Professor Andrei Volkov", 61, "Astrophysicist", 1.75, "Wild Einstein-like Hair", "Cosmic Indigo"));


    }

}
