package ch.bbw.ja.cluedo.model;


public class Person {
    private String name; //Attribut, Eigenschaft eines Objektes: Ich Habe
    private int age;
    private String job;
    private double height;
    private String feature;
    private String color;

    public Person(String name, int age, String job, double height, String feature, String color) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.height = height;
        this.feature = feature;
        this.color = color;
        //Wird benutzt um ein Objekt zu instanziieren und beim instanziieren Direktwert mitgeben
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public double getHeight() {
        return height;
    }

    public String getFeature() {
        return feature;
    }

    public String getColor() {
        return color;
    }
}
