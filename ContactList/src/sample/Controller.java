package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

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
        dispname.setText(person.getFirst()+ " " + person.getLast());
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
}
