import java.util.ArrayList;
import java.util.Date;


public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    Customer(){
       accountNumber = 1;
       checkBalance = 1;
       savingBalance = 1;
       savingRate = 1;
       name = "";


    }
    Customer(String name, int accountNumber, double checkBalance, double savingBalance){
        this.accountNumber = accountNumber;
        this.deposits = new ArrayList();
        this.withdraws = new ArrayList();
        this.checkBalance = checkBalance;
        this.savingBalance = savingBalance;
        this.savingRate = savingRate;
        this.name = name;

    }

    public double deposit(double amt, Date date, String account){
        //your code here
        /*
        Requires: Double "amt", Date, String "account"
        Modifies: this, deposits
        Effects: Adds a new deposit to the Arraylist
        */
        deposits.add(new Deposit(amt, date, account));
        if(account.equals("Checking")){
            checkBalance = checkBalance + amt;
            return checkBalance;

        }else if(account.equals("Saving")){
            savingBalance = savingBalance + amt;
            return savingBalance;
        }
        return 0;
    }
    public double withdraw(double amt, Date date, String account){
        //your code here
        /*
        Requires: Double "amt", Date, String "account"
        Modifies: this, withdraws
        Effects: Adds a new withdrawal to the Arraylist
        */



        withdraws.add(new Withdraw(amt, date, account));
        if(account.equals("Checking")){
            checkBalance = checkBalance - amt;
            checkOverdraft(amt, "Checking");
            return checkBalance;

        }else if(account.equals("Saving")){
            savingBalance = savingBalance - amt;
            checkOverdraft(amt, "Saving");
            return savingBalance;
        }
        return 0;
    }

    private boolean checkOverdraft(double amt, String account){
        //your code here
        /*
        Requires: amt, accout, OVERDRAFT, Balance (Checking and Saving)
        Modifies: this, withdraws Arraylist
        Effects: Will check if the withdrawal has overdrafted or not, if it has, it will
        revert the transaction and reimburse the account back to its initial value
        */
        if(account.equals("Checking")){
            if(checkBalance-amt<OVERDRAFT){
                System.out.println("A Withdrawal has overdrafted, reverting transaction");
                checkBalance = checkBalance + amt;
                withdraws.remove(withdraws.size() -1);
                return true;
            }
        }
    else if(account.equals("Saving")){
            if(savingBalance-amt<OVERDRAFT){
                System.out.println("A Withdrawal has overdrafted, reverting transaction");
                savingBalance = savingBalance + amt;
                withdraws.remove(withdraws.size() -1);
                return true;
            }
        }
        return false;
    }
    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

    public Deposit getDeposit(int i){
        /*
        Requires: deposits Arraylist, int i
        Modifies: this
        Effects: Returns the deposit at index position i
        */
        Deposit returnedDeposit = deposits.get(i);
        return returnedDeposit;
    }
    public Withdraw getWithdraw(int i){
        /*
        Requires: withdraws Arraylist, int i
        Modifies: this
        Effects: Returns the withdrawal at index position i
        */
        Withdraw returnedWithdraw = withdraws.get(i);
        return returnedWithdraw;
    }
    //below are getters i manually created to make the code and tests work
    public double getCheckBal(){
        return checkBalance;
    }
    public double getSavBal(){
        return savingBalance;
    }
    public int depositSize(){
        return deposits.size();
    }
    public int withdrawSize(){
        return withdraws.size();
    }
}
