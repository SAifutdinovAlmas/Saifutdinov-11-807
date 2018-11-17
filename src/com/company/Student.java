package com.company;


public class Student {
    private int age;
    private String floor;
    private String name;
    private String surname;
    private int age1;
    private String floor1;
    private String name1;
    private String surname1;

    Student() {
        name = "Almas";
        surname = "Saifutdinov";
        age = 18;
        floor = "Man";
        name1 = "Olga";
        surname1 = "Petrovna";
        age1 = 18;
        floor1 = "Woman";
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getFloor() {
        return floor;
    }
    public String getName1() {
        return name1;
    }

    public String getSurname1() {
        return surname1;
    }

    public int getAge1() {
        return age1;
    }

    public String getFloor1() {
        return floor1;
    }
}

