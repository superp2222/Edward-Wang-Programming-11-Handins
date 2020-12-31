package sample;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public Label labelOutcome;
    public Label labelBalance;
    public Button buttonHeads;
    public Button buttonTails;
    public Label labeldispmessage;
    public TextField textbetamt;
    public Button buttonReset;
    int balance = 100;
    Random coinflip = new Random();

    public void startSimulator(ActionEvent actionEvent) {
        buttonHeads.setDisable(false);
        buttonTails.setDisable(false);
    }

    public void betHeads(ActionEvent actionEvent) {
        if(balance > 0) {
            int betAmt = Integer.parseInt(textbetamt.getText());
            if(betAmt <= balance) {
                int prizemoney = betAmt * 2;
                labelBalance.setText(Integer.toString(balance));
                boolean results = coinflip.nextBoolean();
                balance = balance - betAmt;
                if (results == true) {
                    labelOutcome.setText("Heads");
                    labeldispmessage.setText("You Won!");
                    balance = balance + prizemoney;
                    labelBalance.setText(Integer.toString(balance));

                } else if (results == false) {
                    labelOutcome.setText("Tails");
                    labeldispmessage.setText("You Lost!");
                    labelBalance.setText(Integer.toString(balance));


                }
            }else{
                labelOutcome.setText("Invalid");
                labeldispmessage.setText("Not enough money!");
            }
        }else{
            labelOutcome.setText("Bankrupt");
            labeldispmessage.setText("No money!");
        }


    }

    public void betTails(ActionEvent actionEvent) {
        if(balance > 0) {
            int betAmt = Integer.parseInt(textbetamt.getText());
            if(betAmt <= balance) {
                int prizemoney = betAmt * 2;
                labelBalance.setText(Integer.toString(balance));
                balance = balance - betAmt;
                boolean results = coinflip.nextBoolean();
                if (results == true) {
                    labelOutcome.setText("Heads");
                    labeldispmessage.setText("You Lost!");
                    labelBalance.setText(Integer.toString(balance));

                } else if (results == false) {
                    labelOutcome.setText("Tails");
                    labeldispmessage.setText("You Won!");
                    balance = balance + prizemoney;
                    labelBalance.setText(Integer.toString(balance));

                }
            }else{
                labelOutcome.setText("Invalid");
                labeldispmessage.setText("Not enough money!");
            }
        }else{
            labelOutcome.setText("Bankrupt");
            labeldispmessage.setText("No money!");
        }
    }


    public void resetGame(ActionEvent actionEvent) {
        labelOutcome.setText("");
        labeldispmessage.setText("");
        balance = 100;
        labelBalance.setText(Integer.toString(balance));
        textbetamt.clear();
        buttonHeads.setDisable(true);
        buttonTails.setDisable(true);

    }
}
