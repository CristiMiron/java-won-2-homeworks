package ro.fasttrackit.homeworks.curs11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentGradesFromFile {
    public static void main(String[] args) throws Exception{
        List<StudentGrade> grades = gradesFromFile();
        System.out.println(grades);

        writeGradesToFile(grades);



    }

    private static List<StudentGrade> gradesFromFile() throws Exception{
        List<StudentGrade> grades = new ArrayList<>();
        BufferedReader fileReader = new BufferedReader(new FileReader("files/grades.txt"));
        String line;
        while ((line = fileReader.readLine()) != null){
            grades.add(readGrades(line));
        }
        return grades;
    }

    private static StudentGrade readGrades(String gradesInfo) {
        String [] gradesData = gradesInfo.split("\\|");
        return new StudentGrade(gradesData[0],gradesData[1], Integer.parseInt(gradesData[2]));
    }
    private static void writeGradesToFile(List<StudentGrade> grades) throws Exception{
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("files/grade-reports.out"))) {
            for(StudentGrade grade : grades){
                String line = gradesToString(grade);
                writer.write(line);
                writer.newLine();
            }
        }
    }

    private static String gradesToString(StudentGrade grade) {
        return grade.getName() + ";" + grade.getGrades();
    }



}
