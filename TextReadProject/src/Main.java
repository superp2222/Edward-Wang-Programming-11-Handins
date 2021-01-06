import java.io.*;
import java.util.ArrayList;
import java.io.FileReader;
import java.util.Scanner;


public class Main {
    public static ArrayList<String> lines;
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        lines = new ArrayList<String>();
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            lines.add(line);
        }
        keyboardData();
        br.close();
    }
    public static void keyboardData() throws IOException {
        System.out.println("Enter a word to search");
        String search = scan.next();
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        int idx = 0;
        int occurences = 0;
        ArrayList<Integer> indexes = new ArrayList<>();
        for (String s : lines) {
            if(s.contains(search)){
                indexes.add(idx);
            }
            idx++;
        }
        if (indexes.size() > 0) {
            System.out.println("Found word: " + search + "\nat Line(s)");
            for (int index : indexes) {
                System.out.println(index + 1);
                String[] array = lines.get(index).split(" ");
                for(String word : array){
                    if(word.contains(search)){
                        occurences++;
                    }
                }
            }
            System.out.println("Total Occurences: " + occurences);
        }else{
            System.out.println("No occurences found");
        }
    }


}
