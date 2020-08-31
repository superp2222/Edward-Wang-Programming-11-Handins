import java.util.Random;
/*
In this class, we give the teacher a first and last name, and their taught subject,
the constructors are also there to allow for custom variants of the object student.
After that, we have the setters and getters for
each variable, followed by a method that gives the name and taught subject of the
teacher
 */
public class Teacher {
    Random rand = new Random();
    String first;
    String last;
    String subject;

    Teacher(){
    first = "name";
    last = "";
    subject = "subject";
    }
    //Teacher constructor

    Teacher(String first, String last, String subject){
        this.first = first;
        this.last = last;
        this.subject = subject;
    }
    //the other constructor for teacher

    //the following are all setters and getters
    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    //this is the method that gives the name and subject the teacher is teaching
    public static void getRole(String first, String subject){
        System.out.println("Name:" + first + "Subject:" + subject);
    }
}
