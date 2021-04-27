package ro.fasttrackit.homeworks.curs11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Classroom {
    private final List<StudentGrade> classroom;

    public Classroom() {
        this(new ArrayList<>());
    }

    public Classroom(Collection<StudentGrade> classroom) {
        this.classroom = new ArrayList<>();
        this.classroom.addAll(classroom);
    }

    public List<StudentGrade> getClassroom() {
        return classroom;
    }

//- getMaxGrade(String discipline) :StudentGrade
//- getMaxGrade() : StudentGrade
//- getAverageGrade(String discipline) : Integer
//- getWorstGrade(String discipline) : StudentGrade

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> result = new ArrayList<>();
        for (StudentGrade disciplineGrades : classroom) {
            if (discipline.equals(disciplineGrades.getDiscipline())) {
                result.add(disciplineGrades.getGrades());
            }
        }
        return result;
    }

    public List<StudentGrade> getGradesForStudent(String student) {
        List<StudentGrade> result = new ArrayList<>();
        for (StudentGrade gradesOfStudent : classroom) {
            if (student.equals(gradesOfStudent.getName())) {
                result.add(gradesOfStudent);
            }
        }
        return result;
    }


}


