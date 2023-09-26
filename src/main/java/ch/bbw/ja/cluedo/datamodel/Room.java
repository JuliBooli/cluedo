package ch.bbw.ja.cluedo.datamodel;

public class Room {
    private String name;
    private String location;

    private String decoration;

    public Room(String name, String location, String decoration) {
        this.name = name;
        this.location = location;
        this.decoration = decoration;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getDecoration() {
        return decoration;
    }
}
