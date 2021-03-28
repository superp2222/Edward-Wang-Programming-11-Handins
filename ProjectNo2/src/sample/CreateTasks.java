package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CreateTasks {
    private static String taskName;
    private static String task;
    private static FileReader fr;
    private static BufferedReader br;
    private static ArrayList<Task> tasks = new ArrayList<>();
    public static boolean attemptedDuplicate;


    public static ArrayList<Task> createAllTasks(String fileName) throws IOException {
        /*
        In this method, the filereader adds all lines in the SavedLists text file into an arraylist
        There, a scanner will scan each line until it encounters the ending indicator: "§"
        Once it does, it parses all strings before it. More about parsing in the ParseTask Method
        Afterwards, it returns the arraylist of stored objects back to the main UploadList method in Controller
        where the Controller method will turn the arraylist values into Objects
         */
        fr = new FileReader(fileName);
        br = new BufferedReader(fr);
        String line;
        String taskString = "";
        while((line = br.readLine()) != null){
            if(!line.equals("§")){
                taskString += line;
            }else{
                parseTask(taskString);
                taskString = "";
            }
        }
        br.close();
        return tasks;

    }
    private static void parseTask(String string){
        /*
        In the ParseTask Method, the for loop will scan each string until it encounters the separation indicator
        In this case, the separation indicator is "*"
        Once it does, it designates all strings before the indicator as the name and all strings after the indicator
        that is also before the ending indicator § as the task description
        Finally, it checks if the task has already been added, if it has, it doesnt add it, if not, it adds it.
         */
        int pos = 0;
        int a = 0;
        String taskName = "";
        String task = "";
        for(int i = 0; i < string.length();i++){
            if(string.substring(i, i+1).equals("*")){
                pos = i;
                a = i;
                taskName = string.substring(0, a);
                task = string.substring(a+1);
            }
        }
        Task tobeadded = new Task(taskName, task);
        if(!tasks.contains(tobeadded)){
            tasks.add(tobeadded);
        }

    }
}
