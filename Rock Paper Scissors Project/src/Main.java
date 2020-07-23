import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String playerChoice;
        String compChoice;
        //These are the raw inputs
        String playerFinal;
        String compFinal;
        //These are final imputs, just to clean up things just in case something goes wrong
        Scanner scan = new Scanner(System.in);
        //Scanner program


        System.out.println("Please enter r for Rock, s for Scissors, or p for Paper");
        playerChoice = scan.next();
        //Computer asks the player for input, which will be stored to playerChoice
        int rand = (int)(Math.random() * 100);
        //the computer then generates a random number between 1 and 100

        //the following if bracket will split the random number into 3 possible scenarios
        if(rand <= 33){
            //In this case, the number is 33 or under, so im assigning it as rock
            compFinal = "rock";
            if(playerChoice.equals("r")){
                playerFinal = "rock";
                //since the playerChoice is r, the playerFinal becomes rock
                System.out.println("Draw!");
                //match results
                System.out.println("Computer Choice:" + compFinal + "   Player Choice:" + playerFinal);
                //This is the reason why I made final values, for a clean presentation of the choices
            }
            else if(playerChoice.equals("p")){
                //This is for if the player entered p
                playerFinal = "paper";
                System.out.println("Victory!");
                //match results
                System.out.println("Computer Choice:" + compFinal + "   Player Choice:" + playerFinal);
                //in this case, playerFinal is paper
            }
            else if(playerChoice.equals("s")){
                playerFinal = "scissors";
                //if the player entered s
                System.out.println("Defeat!");
                System.out.println("Computer Choice:" + compFinal + "   Player Choice:" + playerFinal);
                //match results
            }
            else{
                System.out.println("404 Choice Not Found, Play again?");
                //this is for if the player entered something that isn't r, s, or p
            }


        }
        else if(rand > 66){
            //if the number generator gave a number that is above 66, then the computer's choice
            //would be paper
            compFinal = "paper";
            if(playerChoice.equals("r")){
                playerFinal = "rock";
                //if the player entered r
                System.out.println("Defeat!");
                System.out.println("Computer Choice:" + compFinal + "   Player Choice:" + playerFinal);
            }
            else if(playerChoice.equals("p")){
                playerFinal = "paper";
                //if the player entered p
                System.out.println("Draw!");
                System.out.println("Computer Choice:" + compFinal + "   Player Choice:" + playerFinal);
            }
            else if(playerChoice.equals("s")){
                playerFinal = "scissors";
                //if the player enterd s
                System.out.println("Victory!");
                System.out.println("Computer Choice:" + compFinal + "   Player Choice:" + playerFinal);
            }
            else{
                System.out.println("404 Choice Not Found, Play again?");
                //if the player entered something that isn't r, s, or p
            }

        }
        else{
            compFinal = "scissors";
            //if the number isn't above 66 or below 33, then it becomes scissors
            if(playerChoice.equals("r")){
                playerFinal = "rock";
                //if player entered r
                System.out.println("Victory!");
                System.out.println("Computer Choice:" + compFinal + "   Player Choice:" + playerFinal);
            }
            else if(playerChoice.equals("p")){
                playerFinal = "paper";
                //if player entered p
                System.out.println("Defeat!");
                System.out.println("Computer Choice:" + compFinal + "   Player Choice:" + playerFinal);
            }
            else if(playerChoice.equals("s")){
                playerFinal = "scissors";
                //if player entered s
                System.out.println("Draw!");
                System.out.println("Computer Choice:" + compFinal + "   Player Choice:" + playerFinal);
            }
            else{
                System.out.println("404 Choice Not Found, Play again?");
                //if player entered something that isn't r, s, or p
            }

        }





    }
}
