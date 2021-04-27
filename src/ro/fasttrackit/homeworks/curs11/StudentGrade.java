package ro.fasttrackit.homeworks.curs11;

import java.util.Objects;

public class StudentGrade {
    private final String name;
    private final String discipline;
    private final int grades;

    public StudentGrade(String name, String discipline, int grades) {
        this.name = name;
        this.discipline = discipline;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getDiscipline() {
        return discipline;
    }

    public int getGrades() {
        return grades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentGrade that = (StudentGrade) o;
        return grades == that.grades && Objects.equals(name, that.name) && Objects.equals(discipline, that.discipline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, discipline, grades);
    }

    @Override
    public String toString() {
        return "StudentGrade{" +
                "name='" + name + '\'' +
                ", discipline='" + discipline + '\'' +
                ", grades=" + grades +
                '}';
    }
}
