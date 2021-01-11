package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Controller {

    public ListView<Contact> listcontact = new ListView<>();
    public Label dispname;
    public Label dispphone;
    public Label dispaddress;
    public Label dispnotes;
    public Button buttondelete;
    public TextField textfirst;
    public TextField textlast;
    public TextField textphone;
    public TextField textaddress;
    public TextArea textnotes;
    public Button buttonCreate;
    public TextField textSaveFile;
    public Label labelSysMessage;

    public void deletecontact(ActionEvent actionEvent) {
        Contact person;
        person = listcontact.getSelectionModel().getSelectedItem();
        listcontact.getItems().remove(person);
        dispname.setText("");
        dispaddress.setText("");
        dispphone.setText("");
        dispnotes.setText("");
        buttondelete.setDisable(true);
    }

    public void dispinfo(MouseEvent mouseEvent) {
        Contact person;
        person = listcontact.getSelectionModel().getSelectedItem();
        dispname.setText(person.getFirst() + " " + person.getLast());
        dispaddress.setText(person.getAddress());
        dispphone.setText(person.getPhone());
        dispnotes.setText(person.getNotes());
        buttondelete.setDisable(false);

    }

    public void createContact(ActionEvent actionEvent) {
        String firstname = textfirst.getText();
        String lastname = textlast.getText();
        String phonenum = textphone.getText();
        String address = textaddress.getText();
        String notes = textnotes.getText();
        Contact person = new Contact(firstname, lastname, phonenum, address, notes);
        listcontact.getItems().add(person);
        textfirst.clear();
        textlast.clear();
        textphone.clear();
        textaddress.clear();
        textnotes.clear();
        buttondelete.setDisable(true);


    }

    public void saveFile(ActionEvent actionEvent) throws IOException {
        labelSysMessage.setText("");
        if (textSaveFile.getText().equals("1") || textSaveFile.getText().equals("one")) {
            ObservableList<Contact> myList = listcontact.getItems();
            for (Contact c : myList) {
                c.writeToOne();
            }
            listcontact.getItems().clear();
            textSaveFile.clear();
            dispname.setText("");
            dispaddress.setText("");
            dispphone.setText("");
            dispnotes.setText("");
        }else if(textSaveFile.getText().equals("2") || textSaveFile.getText().equals("two")) {
            ObservableList<Contact> myList = listcontact.getItems();
            for (Contact c : myList) {
                c.writeToTwo();
            }
            listcontact.getItems().clear();
            textSaveFile.clear();
            dispname.setText("");
            dispaddress.setText("");
            dispphone.setText("");
            dispnotes.setText("");
        }else if(textSaveFile.getText().equals("3") || textSaveFile.getText().equals("three")){
            ObservableList<Contact> myList = listcontact.getItems();
            for (Contact c : myList) {
                c.writeToThree();
            }
            listcontact.getItems().clear();
            textSaveFile.clear();
            dispname.setText("");
            dispaddress.setText("");
            dispphone.setText("");
            dispnotes.setText("");
        }else if (textSaveFile.getText().equals("4") || textSaveFile.getText().equals("four")){
            ObservableList<Contact> myList = listcontact.getItems();
            for (Contact c : myList) {
                c.writeToFour();
            }
            listcontact.getItems().clear();
            textSaveFile.clear();
            dispname.setText("");
            dispaddress.setText("");
            dispphone.setText("");
            dispnotes.setText("");
        }else if(textSaveFile.getText().equals("5") || textSaveFile.getText().equals("five")){
            ObservableList<Contact> myList = listcontact.getItems();
            for (Contact c : myList) {
                c.writeToFive();
            }
            listcontact.getItems().clear();
            textSaveFile.clear();
            dispname.setText("");
            dispaddress.setText("");
            dispphone.setText("");
            dispnotes.setText("");
        }else{
            labelSysMessage.setText("Error: Invalid Input");
            textSaveFile.clear();
        }


    }


    public void loadSave(ActionEvent actionEvent) throws IOException {
        labelSysMessage.setText("");
        if (textSaveFile.getText().equals("1") || textSaveFile.getText().equals("one")) {
            listcontact.getItems().clear();
            ArrayList<Contact> contact = CreateContact.createAllContacts("fileOne.txt");
            for (Contact c : contact) {
                listcontact.getItems().add(c);
            }
            textSaveFile.clear();
        } else if (textSaveFile.getText().equals("2") || textSaveFile.getText().equals("two")) {
            listcontact.getItems().clear();
            ArrayList<Contact> contact = CreateContact.createAllContacts("fileTwo.txt");
            for (Contact c : contact) {
                listcontact.getItems().add(c);
            }
            textSaveFile.clear();
        } else if (textSaveFile.getText().equals("3") || textSaveFile.getText().equals("three")) {
            listcontact.getItems().clear();
            ArrayList<Contact> contact = CreateContact.createAllContacts("fileThree.txt");
            for (Contact c : contact) {
                listcontact.getItems().add(c);
            }
            textSaveFile.clear();
        } else if (textSaveFile.getText().equals("4") || textSaveFile.getText().equals("four")) {
            listcontact.getItems().clear();
            ArrayList<Contact> contact = CreateContact.createAllContacts("fileFour.txt");
            for (Contact c : contact) {
                listcontact.getItems().add(c);
            }
            textSaveFile.clear();
        } else if (textSaveFile.getText().equals("5") || textSaveFile.getText().equals("five")) {
            listcontact.getItems().clear();
            ArrayList<Contact> contact = CreateContact.createAllContacts("fileFive.txt");
            for (Contact c : contact) {
                listcontact.getItems().add(c);
            }
            textSaveFile.clear();
        } else {
            labelSysMessage.setText("Error: Invalid Input");
            textSaveFile.clear();
        }
    }

    public void clearFile(ActionEvent actionEvent) throws IOException {
        labelSysMessage.setText("");
        if (textSaveFile.getText().equals("1") || textSaveFile.getText().equals("one")) {
            FileWriter fw = new FileWriter("fileOne.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.flush();
            bw.close();
            textSaveFile.clear();
        } else if (textSaveFile.getText().equals("2") || textSaveFile.getText().equals("two")) {
            FileWriter fw = new FileWriter("fileTwo.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.flush();
            bw.close();
            textSaveFile.clear();
        } else if (textSaveFile.getText().equals("3") || textSaveFile.getText().equals("three")) {
            FileWriter fw = new FileWriter("fileThree.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.flush();
            bw.close();
            textSaveFile.clear();
        } else if (textSaveFile.getText().equals("4") || textSaveFile.getText().equals("four")) {
            FileWriter fw = new FileWriter("fileFour.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.flush();
            bw.close();
            textSaveFile.clear();
        } else if (textSaveFile.getText().equals("5") || textSaveFile.getText().equals("five")) {
            FileWriter fw = new FileWriter("fileFive.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.flush();
            bw.close();
            textSaveFile.clear();
        } else {
            labelSysMessage.setText("Error: Invalid Input");
            textSaveFile.clear();
        }
    }
}



