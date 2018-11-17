package com.company;

public class App1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        //String name = student1.getName();
        String surname = student1.getSurname();
        int age = student1.getAge();
        String floor = student1.getFloor();
        System.out.println(student1.getName() + " " + surname + " " + age + " " + floor);
        String name1 = student1.getName1();
        String surname1 = student1.getSurname1();
        int age1 = student1.getAge1();
        String floor1 = student1.getFloor1();
        System.out.println(name1 + " " + surname1 + " " + age1 + " " + floor1);
    }
}
