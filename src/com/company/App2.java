package com.company;

public class App2 {
    public static void main(String[] args){
        Student1 student = new Student1();
        String surname = student.getSurname();
        int age = student.getAge();
        String afloor = student.getFloor();
        System.out.println(student.getName() + " " + surname + " " + age + " " + afloor);
        String name = student.getName();
        String surname1 = student.getSurname();
        int aage = student.getAge();
        String floor = student.getFloor();
        System.out.println(name + " " + surname + " " + aage + " " + floor);
    }
}
