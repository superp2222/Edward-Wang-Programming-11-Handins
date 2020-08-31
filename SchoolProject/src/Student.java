import java.util.Random;
/*
In this class, we give the student a first and last name, their grade,
and a unique student ID using static ints, the constructors allow for custom
variants of the object student. after that, we have the setters and getters for
each variable, followed by a method that gives the name and grade of the student
 */
public class Student {
    Random rand = new Random();
    String sFirst;
    String sLast;
    String grade;
    static int studentNum = 1;
    int id;
    Student(){
        sFirst = "name";
        sLast = "";
        grade = "grade";
        id = studentNum;
        studentNum++;

    }
    //constructors for Student
    Student(String sFirst, String sLast, String grade){
        this.sFirst = sFirst;
        this.sLast = sLast;
        this.grade = grade;
        this.id = studentNum;
        studentNum++;
        
    }

    //setters and getters

    public String getsFirst() {
        return sFirst;
    }

    public void setsFirst(String sFirst) {
        this.sFirst = sFirst;
    }

    public String getsLast() {
        return sLast;
    }

    public void setsLast(String sLast) {
        this.sLast = sLast;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public static int getStudentNum() {
        return studentNum;
    }

    public static void setStudentNum(int studentNum) {
        Student.studentNum = studentNum;
    }

    //method for the name and grade display
    public static void getRole(String sFirst, String grade) {
        System.out.println("Name:" + sFirst + "Grade" + grade);
    }
}
