package com.company;

import java.util.Random;

public class Student1 {
    Random random = new Random();

    private int age;
    private String[] floorArray = {"men", "woman"};
    private String floor;
    private String[] nameArray = {"Almas", "Danil", "Olga", "Masha"};
    private String[] surnameArray = {"Petrov", "Semakov", "Ovechkina", "Petrovna"};
    private String name;
    private String surname;

    Student1() {
        do{
            age = random.nextInt(22);
        }while (age < 18);
        floor = floorArray[random.nextInt(1)];
        name = nameArray[random.nextInt(3)];
        surname = surnameArray[random.nextInt(3)];
    }

    public String getName() {
        return name;
    }

    public String getSurname() { return surname; }

    public int getAge() {
        return age;
    }

    public String getFloor() {
        return floor;
    }
}
