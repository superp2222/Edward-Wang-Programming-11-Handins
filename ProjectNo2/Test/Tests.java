import javafx.event.ActionEvent;
import org.junit.Before;
import org.junit.Test;
import sample.Controller;
import sample.CreateTasks;
import sample.Quotes;
import sample.Task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;

public class Tests {
    @Before
    public void setUp(){
        ArrayList<Task> test;
    }
    @Test

    public void checkDifferentQuote(){
        /*
        This method tests that each time we're getting a different quote that isnt the one
        that is currently displayed. Once the quote is displayed, it makes sure that the ending indicator
        wasn't also copied onto the label
        */
        String alpha = Quotes.getQuote();
        String beta = Quotes.getQuote();
        assertFalse(alpha.equals(beta));
        assertFalse(alpha.contains("§"));
        assertFalse(beta.contains("§"));
    }
    @Test
    public void checkIndicators() throws IOException {
        /*
        Similar to the Quote Test, this method checks that once the Task has been uploaded to the List,
        the indicators are removed
         */
        ArrayList<Task> test = CreateTasks.createAllTasks("SavedList.txt");
        for(Task s : test){
            assertFalse(s.getTask().contains("§"));
            assertFalse(s.getTaskName().contains("*"));
        }

    }
    @Test
    public void checkIndicatorPresent() throws IOException {
        /*
        In this method, it checks that the indicators are present within the saved txt file.
         */
        ArrayList<String> lines;
        lines = new ArrayList<String>();
        FileReader fr = new FileReader("SavedList.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            lines.add(line);
        }
        int idx = 0;
        int occurences = 0;
        int occurencesbeta = 0;
        ArrayList<Integer> indicatorOne = new ArrayList<>();
        ArrayList<Integer> indicatorTwo = new ArrayList<>();
        for (String s : lines) {
            if(s.contains("*")){
                indicatorOne.add(idx);
            }
            else if(s.contains("§")){
                indicatorTwo.add(idx);
            }
            idx++;
        }
        for (int index : indicatorOne) {
            String[] array = lines.get(index).split("");
            for(String word : array){
                if(word.contains("*")){
                    occurences++;
                }
            }
        }
        for (int index : indicatorTwo) {
            String[] array = lines.get(index).split("");
            for(String word : array){
                if(word.contains("§")){
                    occurencesbeta++;
                }
            }
        }
        assertTrue(occurences >= 1);
        assertTrue(occurencesbeta >= 1);
        br.close();
    }

}
