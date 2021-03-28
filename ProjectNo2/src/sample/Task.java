package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task {
    /*
    This is the Object Task for the To Do List, it comprises of a name and a description
     */
    String task;
    String taskName;


    Task(String taskName, String task){
        this.task = task;
        this.taskName = taskName;
    }
    public String toString(){
        return taskName;
    }
    public void saveTask() throws IOException{
        /*
        Here the task is saved onto the Text File, this method will be called on by the SaveList Method in Controller
        The name is written with the separation indicator * and the ending indicator §, which signify the
        separation of the name and description and the separation of object and object respectively
         */
        FileWriter fw = new FileWriter("SavedList.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(taskName + "*\r");
        bw.write(task + "\r");
        bw.write("§\r");
        bw.close();
    }
    /*
    Getters and Setters
     */
    public String getTask() {
        return task;
    }
    public void setTask(String task) {
        this.task = task;
    }
    public String getTaskName() {
        return taskName;
    }
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

}
