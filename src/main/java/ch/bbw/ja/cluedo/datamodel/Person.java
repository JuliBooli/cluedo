package ch.bbw.ja.cluedo.datamodel;

import java.util.List;

public class Person {
    private String name;
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
    }

}
