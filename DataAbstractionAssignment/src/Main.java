import java.util.Date;


public class Main {
    public Main() {
    }

    public static void main(String[] args){
        Customer Bobby = new Customer("Bobby", 001, 100, 100);
        //what should happen here is that we need to deposit 2 amounts, but also
        //do withdraw as well to prove the system works
        //the actual accounts shouldn't actually have any value to them, they're Strings
        Date a1 = new Date(118, 10, 04, 0, 0, 0);
        Date a2 = new Date(118, 07, 16, 10, 52, 17);

        Bobby.deposit(400, a1, "Checking");
        Bobby.deposit(500, a2, "Saving");
        Bobby.displayDeposits();
        Bobby.withdraw(50, a2, "Checking");
        Bobby.withdraw(5000, a1, "Checking");
        Bobby.displayWithdraws();
    }
}
