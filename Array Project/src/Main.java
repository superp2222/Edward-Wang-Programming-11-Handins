import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.copyOf;

public class Main {

    static int[] add(int x, int[] array){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter how many new lines you would like in your Array");
        x = Integer.parseInt(scan.next());
        int extend = x;
        array = copyOf(array, array.length + extend);
        return array;


    }
    static int[] minus(int y, int[] array){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter how many new lines you would like to remove in your Array");
        y = Integer.parseInt(scan.next());
        int decrease = y;
        array = copyOf(array, array.length - decrease);
        return array;


    }
    static int[] insert(int z, int pos, int array[], int n){
        int i;
        int newArray[] = new int[n + 1];
        Scanner scan = new Scanner(System.in);

        for(i = 0; i < n + 1; i++){
            if(i < pos - 1){
                newArray[i] = array[i];
            }else if(i == pos - 1){
                newArray[i] = z;
            }else{
                newArray[i] = array[i - 1];
            }
        }
        return newArray;



    }

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int z = 0;
        int pos = 0;
        int extend = 0;
        int decrease = 0;
        String playerInput;


        Scanner scan = new Scanner(System.in);

        int[] array = {0, 1, 2, 3, 4};
        System.out.println("Default array length is: " + array.length);
        System.out.println("Would you like to extend it?");
        System.out.println("Enter y to extend, press any other key to ignore");
        playerInput = scan.next();

        if(playerInput.equals("y")){

           array = add(x, array);
            System.out.println("Array length is now " + array.length);


        }
        System.out.println("Would you like to decrease the length?");
        System.out.println("Enter y to extend, press any other key to ignore");
        playerInput = scan.next();

        if(playerInput.equals("y")){

            array = minus(y, array);
            System.out.println("Array length is now " + array.length);


        }
        System.out.println("Would you like to insert a value at a given position?");
        System.out.println("Enter y to insert, press any other key to ignore");
        int n = array.length;
        playerInput = scan.next();

        if(playerInput.equals("y")){
            System.out.println("Please enter the value you would like to insert into the Array");
            z = Integer.parseInt(scan.next());
            System.out.println("Please enter the location you would like to insert the value");
            pos = Integer.parseInt(scan.next());
          array = insert(z, pos, array, n);
            System.out.println("Inserted " + z + " at " + pos + "\n" + Arrays.toString(array));
        }


    }
}
