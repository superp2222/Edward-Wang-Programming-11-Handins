import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String playerChoice;
        String compChoice;
        //These are the raw inputs
        String playerFinal;
        String compFinal;
        //These are final imputs, just to clean up things just in case something goes wrong
        String playerInput;
        boolean playAgain;
        int playerScore = 0;
        int compScore = 0;
        Scanner scan = new Scanner(System.in);
        //Scanner program for detecting player input

        do {
            System.out.println("-------------------------------------------------------");
            System.out.println("Please enter r for Rock, s for Scissors, or p for Paper");
            System.out.println("Current Standings:");
            System.out.println("--------------------------");
            System.out.println("| Player:" + playerScore + "\tComp Score:" + compScore + " |");
            System.out.println("--------------------------");
            System.out.println("What is your choice?");
            playerChoice = scan.next();
            //Computer asks the player for input, which will be stored to playerChoice
            int rand = (int) (Math.random() * 100);
            //the computer then generates a random number between 1 and 100

            //the following if bracket will split the random number into 3 possible scenarios
            if (rand <= 33) {
                //In this case, the number is 33 or under, so im assigning it as rock
                compFinal = "rock";
                if (playerChoice.equals("r")) {
                    playerFinal = "rock";
                    //since the playerChoice is r, the playerFinal becomes rock
                    System.out.println("Draw!");
                    //match results
                    System.out.println("Computer Choice:" + compFinal + "   Player Choice:" + playerFinal);
                    //This is the reason why I made final values, for a clean presentation of the choices
                    System.out.println("Enter y to play again");
                    System.out.println("Press any other key to exit");
                    playerInput = scan.next();
                    if (playerInput.equals("y")) {
                        playAgain = true;
                    } else{
                        playAgain = false;
                    }
                } else if (playerChoice.equals("p")) {
                    //This is for if the player entered p
                    playerFinal = "paper";
                    System.out.println("Victory!");
                    playerScore ++;
                    //match results
                    System.out.println("Computer Choice:" + compFinal + "   Player Choice:" + playerFinal);
                    //in this case, playerFinal is paper
                    System.out.println("Enter y to play again");
                    System.out.println("Press any other key to exit");
                    playerInput = scan.next();
                        if (playerInput.equals("y")) {
                            playAgain = true;
                        } else{
                            playAgain = false;
                        }
                } else if (playerChoice.equals("s")) {
                    playerFinal = "scissors";
                    //if the player entered s
                    System.out.println("Defeat!");
                    compScore ++;
                    System.out.println("Computer Choice:" + compFinal + "   Player Choice:" + playerFinal);
                    //match results
                    System.out.println("Enter y to play again");
                    System.out.println("Press any other key to exit");
                    playerInput = scan.next();
                    if (playerInput.equals("y")) {
                        playAgain = true;
                    } else{
                        playAgain = false;
                    }
                } else {
                    System.out.println("Your Choice is Invalid");
                    //this is for if the player entered something that isn't r, s, or p
                    System.out.println("Enter y to play again");
                    System.out.println("Press any other key to exit");
                    playerInput = scan.next();
                    if (playerInput.equals("y")) {
                        playAgain = true;
                    } else{
                        playAgain = false;
                    }
                }


            } else if (rand > 66) {
                //if the number generator gave a number that is above 66, then the computer's choice
                //would be paper
                compFinal = "paper";
                if (playerChoice.equals("r")) {
                    playerFinal = "rock";
                    //if the player entered r
                    System.out.println("Defeat!");
                    compScore ++;
                    System.out.println("Computer Choice:" + compFinal + "   Player Choice:" + playerFinal);
                    System.out.println("Enter y to play again");
                    System.out.println("Press any other key to exit");
                    playerInput = scan.next();
                    if (playerInput.equals("y")) {
                        playAgain = true;
                    } else{
                        playAgain = false;
                    }
                } else if (playerChoice.equals("p")) {
                    playerFinal = "paper";
                    //if the player entered p
                    System.out.println("Draw!");
                    System.out.println("Computer Choice:" + compFinal + "   Player Choice:" + playerFinal);
                    System.out.println("Enter y to play again");
                    System.out.println("Press any other key to exit");
                    playerInput = scan.next();
                    if (playerInput.equals("y")) {
                        playAgain = true;
                    } else{
                        playAgain = false;
                    }
                } else if (playerChoice.equals("s")) {
                    playerFinal = "scissors";
                    //if the player enterd s
                    System.out.println("Victory!");
                    playerScore ++;
                    System.out.println("Computer Choice:" + compFinal + "   Player Choice:" + playerFinal);
                    System.out.println("Enter y to play again");
                    System.out.println("Press any other key to exit");
                    playerInput = scan.next();
                    if (playerInput.equals("y")) {
                        playAgain = true;
                    } else{
                        playAgain = false;
                    }
                } else {
                    System.out.println("Your Choice is Invalid");
                    //if the player entered something that isn't r, s, or p
                    System.out.println("Enter y to play again");
                    System.out.println("Press any other key to exit");
                    playerInput = scan.next();
                    if (playerInput.equals("y")) {
                        playAgain = true;
                    } else{
                        playAgain = false;
                    }
                }

            } else {
                compFinal = "scissors";
                //if the number isn't above 66 or below 33, then it becomes scissors
                if (playerChoice.equals("r")) {
                    playerFinal = "rock";
                    //if player entered r
                    System.out.println("Victory!");
                    playerScore ++;
                    System.out.println("Computer Choice:" + compFinal + "   Player Choice:" + playerFinal);
                    System.out.println("Enter y to play again");
                    System.out.println("Press any other key to exit");
                    playerInput = scan.next();
                    if (playerInput.equals("y")) {
                        playAgain = true;
                    } else{
                        playAgain = false;
                    }
                } else if (playerChoice.equals("p")) {
                    playerFinal = "paper";
                    //if player entered p
                    System.out.println("Defeat!");
                    compScore ++;
                    System.out.println("Computer Choice:" + compFinal + "   Player Choice:" + playerFinal);
                    System.out.println("Enter y to play again");
                    System.out.println("Press any other key to exit");
                    playerInput = scan.next();
                    if (playerInput.equals("y")) {
                        playAgain = true;
                    } else{
                        playAgain = false;
                    }
                } else if (playerChoice.equals("s")) {
                    playerFinal = "scissors";
                    //if player entered s
                    System.out.println("Draw!");
                    System.out.println("Computer Choice:" + compFinal + "   Player Choice:" + playerFinal);
                    System.out.println("Enter y to play again");
                    System.out.println("Press any other key to exit");
                    playerInput = scan.next();
                    if (playerInput.equals("y")) {
                        playAgain = true;
                    } else{
                        playAgain = false;
                    }
                } else {
                    System.out.println("Your Choice is Invalid");
                    //if player entered something that isn't r, s, or p
                    System.out.println("Enter y to play again,");
                    System.out.println("Press any other key to exit");
                    playerInput = scan.next();
                    if (playerInput.equals("y")) {
                        playAgain = true;
                    } else{
                        playAgain = false;
                    }
                }


            }
        }while(playAgain);





    }
}
