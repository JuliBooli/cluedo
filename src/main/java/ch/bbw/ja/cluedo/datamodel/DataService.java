package ch.bbw.ja.cluedo.datamodel;

import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

/**
 * author: Julian Aschwanden
 */
@Service
public class DataService {
    private List<Person> people;
    private List<Weapon> weapons;
    private List<Room> room;

    public DataService(){
        people = new ArrayList<>();
        weapons= new ArrayList<>();
        room = new ArrayList<>();
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

        weapons.add(new Weapon("Poisoned Dagger", "Steel", 0.3, "Silent"));
        weapons.add(new Weapon("Candlestick", "Brass", 0.8, "Dull Thud"));
        weapons.add(new Weapon("Revolver", "Nickel-Plated", 0.25, "Gunshot"));
        weapons.add(new Weapon("Rope", "Nylon", 2.0, "Strangling Sound"));
        weapons.add(new Weapon("Lead Pipe", "Heavy Metal", 1.2, "Metallic Clang"));
        weapons.add(new Weapon("Poisoned Wine Glass", "Crystal", 0.15, "Poison Bubbles"));

        room.add(new Room("Library", "North Wing", "Bookshelves and Old Books"));
        room.add(new Room("Conservatory", "East Wing", "Plants and Greenery"));
        room.add(new Room("Billiard Room", "West Wing", "Billiard Table and Cue Sticks"));
        room.add(new Room("Study", "South Wing", "Desk and Papers"));
        room.add(new Room("Kitchen", "Basement", "Cooking Utensils and Food"));
        room.add(new Room("Ballroom", "Main Floor", "Chandeliers and Dance Floor"));

    }
    public List<Person> getPeople() {
        return people;
    }
    public List<Weapon> getWeapons(){
        return weapons;
    }
    public List<Room> getRoom(){
        return room;
    }
}
