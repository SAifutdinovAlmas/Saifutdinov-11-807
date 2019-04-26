package Task02;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student v1 = new Student(1, "John", 5);
        Student v2 = new Student(2, "Alex", 10);
        Student v3 = new Student(3, "Bread", 3);
        LinkedList<Student> vols = new LinkedList<Student>();
        vols.add(v1);
        vols.add(v2);
        vols.add(v3);
        StudentTeam team = new StudentTeam(vols);
        // для проверки
        for (Student person :
                team.top10(new ByNameComparator(), 3)) {
            System.out.println(person.getName());
        };
    }
}
