package Task02;

import java.util.Comparator;
import java.util.LinkedList;

public class StudentTeam {
    Comparator<Student> comparator;
    LinkedList<Student> team;

    public StudentTeam(LinkedList team) {
        this.team = team;
    }

    public LinkedList<Student> top10(Comparator<Student> comparator, int n) {
        this.comparator = comparator;
        LinkedList<Student> sortedTeam = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            Student best = team.getFirst();
            for (Student person :
                    team) {
                if (comparator.compare(person, best) < 0) {
                    best = person;
                }
            }
            team.remove(best);
            sortedTeam.add(best);
        }
        return sortedTeam;
    }
}

