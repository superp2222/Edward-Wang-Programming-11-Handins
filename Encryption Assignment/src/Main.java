import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the word you would like to scramble");
        String input = scan.next();
        input = String.valueOf(input.charAt(input.length() - 1) + input.substring(0, input.length() - 1));
        System.out.println(input + "ay");


    }
}
