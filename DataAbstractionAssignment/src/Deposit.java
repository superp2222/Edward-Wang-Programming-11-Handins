import java.util.Date;

public class Deposit {
    private double amount;
    private Date date;
    private String account;

    Deposit(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    public String toString(){
        /*
        Requires: amount, date, account
        Modifies: this, deposit
        Effects: returns the amount, date, and account affected by transaction by
        overriding the Customer Class
        */
        return "Deposit of: $"+amount+" Date: "+date.toString()+" into account: "+account;
    }


}
