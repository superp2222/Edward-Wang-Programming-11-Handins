import java.util.ArrayList;
/*
In this class, we have 2 arraylists that contain lists of teachers and students
the other classes create. We also have 3 fields as instructed on the assignment.
However, the assignment did not specify whether we had to do anything with the fields,
but to keep things interesting I still gave them values. Below the fields are several
methods. Kept static so that they could be accessed through multiple classes. They can
add or delete students and teachers, as well as display current roster.
 */
public class School {
    static ArrayList<Teacher> teachers = new ArrayList<>();
    static ArrayList<Student> students = new ArrayList<>();
    /*
    The two arraylists, they have the static keyword because
    other classes, namely Main, need to access it
     */
    int schoolBudget = 1000000;
    int payRate = 62000;
    String schoolMotto = "Sequens Cognitionem";
    /*
    the three fields, didnt specify whether they had to be interacted with
    or not so they're just given random values
     */
    public static void newStudent() {
        students.add(new Student());
        //this method adds a new student
    }
    public static void newTeacher(){
        teachers.add(new Teacher());
        //this method adds a new teacher
    }
    public static void leavingStudent(){
        if(students.isEmpty() != true) {
            //this if loop is to prevent negative numbers
            students.remove(1);
        }
        //this method removes a student
    }
    public static void leavingTeacher(){
        if(teachers.isEmpty() != true) {
            //this if loop is to prevent negative numbers
            teachers.remove(1);
        }
        //this method removes a teacher
    }
    public static void studentRoster(){
        int f = students.size();
        for(int i = 0; i<f; i++){
            System.out.println(students.get(i));
        }
        //scans how many students there are with the for loop and displays the students
    }
    public static void staffRoster(){
        int e = teachers.size();
        for(int i = 0; i<e; i++){
            System.out.println(teachers.get(i));
        }
        //scans how many teachers there are with the for loop and displays the teachers
    }
    //getters and setters for the 3 fields
    public int getSchoolBudget() {
        return schoolBudget;
    }

    public void setSchoolBudget(int schoolBudget) {
        this.schoolBudget = schoolBudget;
    }

    public int getPayRate() {
        return payRate;
    }

    public void setPayRate(int payRate) {
        this.payRate = payRate;
    }

    public String getSchoolMotto() {
        return schoolMotto;
    }

    public void setSchoolMotto(String schoolMotto) {
        this.schoolMotto = schoolMotto;
    }
}
