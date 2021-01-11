package sample;

import javafx.scene.control.Label;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CreateContact {
    private static String first;
    private static String last;
    private static String phone;
    private static String address;
    private static String notes;
    private static FileReader fr;
    private static BufferedReader br;
    private static ArrayList<Contact> contacts = new ArrayList<>();
    public static boolean attemptedDuplicate;

    public static ArrayList<Contact> createAllContacts(String fileName) throws IOException{
        fr = new FileReader(fileName);
        br = new BufferedReader(fr);
        String line;
        String contactString = "";
        while((line = br.readLine()) != null){
            if(!line.equals(";")){
                contactString += line;
            }else{
                parseContact(contactString);
                contactString = "";
            }
        }
        br.close();
        return contacts;

    }
    private static void parseContact(String string){
        int pos = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        String first = "";
        String last = "";
        String phone = "";
        String address = "";
        String notes = "";
        for(int i = 0; i < string.length();i++){
            if(string.substring(i, i+1).equals("*")){
                pos = i;
                d = i;
                first = string.substring(0, d);
                last = string.substring(d+1);
                a = i+1;
            }
            if(string.substring(i, i+1).equals(".")){
                pos = i;
                last = string.substring(a , pos);
                phone = string.substring(pos+1);
                b = i+1;
            }
            if(string.substring(i, i+1).equals("|")){
                pos = i;
                phone = string.substring(b, pos);
                address = string.substring(pos+1);
                c = i+1;
            }
            if(string.substring(i, i+1).equals("&")){
                pos = i;
                address = string.substring(c, pos);
                notes = string.substring(pos+1);
            }
        }
        Contact tobeadded = new Contact(first, last, phone, address, notes);
        if(!contacts.contains(tobeadded)){
            contacts.add(tobeadded);
        }

    }


}
