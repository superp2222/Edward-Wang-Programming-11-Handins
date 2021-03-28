package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;

public class Controller {
    public ListView<Task> listTasks = new ListView<>();
    public Label labelDate;
    public Button ButtonUpdateDate;
    public Label labelNewReminderScheduled;
    public TextField textToDoList;
    public Button buttonaddToDoList;
    public Button buttonRemoveToDoList;
    public Label labelQuote;
    public Button buttonSaveQuote;
    public Button buttonUploadQuote;
    public Button buttonNewQuote;
    public Label labelQuoteSaved;
    public Button buttonSaveList;
    public Button buttonUploadList;
    public Label labelselectedTask;
    public TextField textTaskName;
    public Label labeldispTaskName;


    public void removeSelectedToDoList(ActionEvent actionEvent) {
        //This method removes the selected To Do List Item
        //The "Mark as Done Button" was just fancy speak for removing this item
        Task assignment;
        assignment = listTasks.getSelectionModel().getSelectedItem();
        listTasks.getItems().remove(assignment);
        labeldispTaskName.setText("");
        labelselectedTask.setText("");
        buttonRemoveToDoList.setDisable(true);

    }

    public void addNewToDoList(ActionEvent actionEvent) {
        /*
        This method adds a new item to the list of To Do Lists
        */
        String todo = textToDoList.getText();
        String todoname = textTaskName.getText();
        Task assignment = new Task(todoname, todo);
        listTasks.getItems().add(assignment);
        textToDoList.clear();
        textTaskName.clear();
        buttonRemoveToDoList.setDisable(true);
        buttonSaveList.setDisable(false);
    }

    public void dispTask(MouseEvent mouseEvent) {
        /*
        This code displays the To Do Task currently selected by the Mouse
         */
        Task assignment;
        assignment = listTasks.getSelectionModel().getSelectedItem();
        labeldispTaskName.setText(assignment.getTaskName());
        labelselectedTask.setText(assignment.getTask());
        buttonRemoveToDoList.setDisable(false);

    }

    public void saveQuote(ActionEvent actionEvent) throws IOException {
        /*
        This method reads the current quote displayed on the label and saves it
         */
        String q = labelQuote.getText();
        FileWriter fw = new FileWriter("SavedQuote.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(q + "§\r");
        bw.close();
        labelQuote.setText("");
        labelQuoteSaved.setText("A quote has been saved");
    }

    public void uploadQuote(ActionEvent actionEvent) throws IOException {
        /*
        This method uploads the saved quote from the previous method and overrides it onto the label
        Before the quote is uploaded, it also checks and removes the ending indicator
         */
        labelQuote.setText("");
        FileReader fr = new FileReader("SavedQuote.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        String quoteString = "";
        while ((line = br.readLine()) != null) {
            if (!line.equals("§")) {
                quoteString += line;
                quoteString = quoteString.replace("§", "");
            }
        }
        br.close();
        labelQuote.setText(quoteString);
        labelQuoteSaved.setText("Quote Uploaded");

    }

    public void newQuote(ActionEvent actionEvent) {
        /*
        This method generates a new quote that isn't the one currently displayed
         */
        String quote = Quotes.getQuote();
        while(quote == labelQuote.getText().toString()){
            quote = Quotes.getQuote();
        }
            labelQuote.setText(quote);

    }

    public void UpdateDate(ActionEvent actionEvent) {
        /*
        This method updates the date currently displayed on the label to the system date
         */
        Date today = new Date();
        labelDate.setText(today.toString());

    }

    public void saveList(ActionEvent actionEvent) throws IOException{
        /*
        This method saves the To Do List
         */
        ObservableList<Task> myList = listTasks.getItems();
        for(Task t : myList){
            t.saveTask();
        }
        listTasks.getItems().clear();
        labelselectedTask.setText("");
        labeldispTaskName.setText("");
        buttonSaveList.setDisable(true);

    }

    public void uploadList(ActionEvent actionEvent) throws IOException {
        /*
        This method uploads the saved To Do List
         */
        listTasks.getItems().clear();
        ArrayList<Task> tasks = CreateTasks.createAllTasks("SavedList.txt");
        for(Task t : tasks){
            listTasks.getItems().add(t);
        }
        buttonSaveList.setDisable(false);
    }
}


