package Grades;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student lorne = new Student("Lorne");
        lorne.addGrade(81);
        lorne.addGrade(67);
        lorne.addGrade(87);
        lorne.addGrade(94);
//        System.out.println(lorne.getGrades());
        Student dennise = new Student("Dennise");
        dennise.addGrade(93);
        dennise.addGrade(89);
        dennise.addGrade(91);
        dennise.addGrade(85);
        Student jeremy = new Student("Jeremy");
        jeremy.addGrade(90);
        jeremy.addGrade(81);
        jeremy.addGrade(77);
        jeremy.addGrade(84);
        System.out.println("Hello Lorne, your grades are: " + lorne.getGrades());
        System.out.println("Your average is: " + lorne.getGradeAvg());
        System.out.println();
    }
}
