import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    /*
    this is the main class, where we will be adding/removing students and teachers
    to their respective listsm, as well as displaying their size. and their contents
    and locations in memory (since the description just said "display both lists"
    I wasnt sure if it meant displaying full contents or just the size`)
     */
    public static void main(String[] args) {

       for(int i = 0; i < 10; i++){
            School.newStudent();
            //adds 10 students to the student ArrayList
        }
       for(int i = 0; i<3; i++){
           School.newTeacher();
           //adds 3 teachers to the teacher ArrayList
       }
        System.out.println("Current Student Count: "+School.students.size());
        System.out.println("Roster:");
        System.out.println(School.students);
        System.out.println("Current Staff Count: "+School.teachers.size()+"\n");
        System.out.println("Roster");
        System.out.println(School.teachers);
        //displays both lists
        for(int i = 0; i<2; i++) {
            School.leavingStudent();
            //removes 2 students
        }
        School.leavingTeacher();
        //removes a teacher

        System.out.println("Current Student Count: "+School.students.size());
        System.out.println("Roster:");
        System.out.println(School.students);
        System.out.println("Current Staff Count: "+School.teachers.size()+"\n");
        System.out.println("Roster");
        System.out.println(School.teachers);
        //displays both lists again



    }
}
