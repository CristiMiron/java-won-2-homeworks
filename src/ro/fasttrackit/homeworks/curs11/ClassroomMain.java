package ro.fasttrackit.homeworks.curs11;

import java.util.List;

public class ClassroomMain {
    public static void main(String[] args) {
        Classroom A = new Classroom(List.of(
                new StudentGrade("Ealhstan Saira", "Math", 8),
                new StudentGrade("Cristi Miron", "Info", 7),
                new StudentGrade("Branwen Evelina", "Physics", 4),
                new StudentGrade("Cristi Miron", "Info", 8),
                new StudentGrade("Cristi Miron", "Math", 6)
        ));

        System.out.println(A.getGradesForDiscipline("Info"));
        System.out.println(A.getGradesForStudent("Cristi Miron"));


    }
}
