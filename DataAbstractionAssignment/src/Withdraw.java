
import java.util.Date;

public class Withdraw {
    private double amount;
    private Date date;
    private String account;

    Withdraw(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    public String toString(){
        /*
        Requires: amount, date, account
        Modifies: this, withdraw
        Effects: returns the amount, date, and account affected by transaction by
        overriding the Customer Class
        */
        return "Withdrawal of: $"+amount+" Date: "+date.toString()+" from account: "+account;
    }


}
