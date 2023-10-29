package ch.bbw.ja.cluedo.model;

public class Weapon {
    private String name;
    private String material;
    private double length;
    private String soundOnKill;

    public Weapon(String name, String material, double length, String soundOnKill) {
        this.name = name;
        this.material = material;
        this.length = length;
        this.soundOnKill = soundOnKill;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public double getLength() {
        return length;
    }

    public String getSoundOnKill() {
        return soundOnKill;
    }
}
