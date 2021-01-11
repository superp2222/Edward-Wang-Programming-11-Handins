package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Contact {
    String first;
    String last;
    String phone;
    String address;
    String notes;


    Contact(String first, String last, String phone, String address, String notes){
       this.first = first;
       this.last = last;
       this.phone = phone;
       this.address = address;
       this.notes = notes;
    }



    public String toString(){
        return first +" "+ last;
    }

    public void writeToOne() throws IOException {
        FileWriter fw = new FileWriter("fileOne.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(first + "*\r");
        bw.write(last + ".\r");
        bw.write(phone + "|\r");
        bw.write(address + "&\r");
        bw.write(notes + "\r");
        bw.write(";\r");
        bw.close();
    }
    public void writeToTwo() throws IOException {
        FileWriter fw = new FileWriter("fileTwo.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(first + "*\r");
        bw.write(last + ".\r");
        bw.write(phone + "|\r");
        bw.write(address + "&\r");
        bw.write(notes + "\r");
        bw.write(";\r");
        bw.close();
    }
    public void writeToThree() throws IOException {
        FileWriter fw = new FileWriter("fileThree.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(first + "*\r");
        bw.write(last + ".\r");
        bw.write(phone + "|\r");
        bw.write(address + "&\r");
        bw.write(notes + "\r");
        bw.write(";\r");
        bw.close();
    }
    public void writeToFour() throws IOException {
        FileWriter fw = new FileWriter("fileFour.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(first + "*\r");
        bw.write(last + ".\r");
        bw.write(phone + "|\r");
        bw.write(address + "&\r");
        bw.write(notes + "\r");
        bw.write(";\r");
        bw.close();
    }
    public void writeToFive() throws IOException {
        FileWriter fw = new FileWriter("fileFive.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(first + "*\r");
        bw.write(last + ".\r");
        bw.write(phone + "|\r");
        bw.write(address + "&\r");
        bw.write(notes + "\r");
        bw.write(";\r");
        bw.close();
    }

    //Getters and Setters
    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getNotes() {
        return notes;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
