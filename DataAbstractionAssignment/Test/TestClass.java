import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Date;

import static org.junit.Assert.*;

public class TestClass {
    Customer Karthus;
    //im guessing this is where the Test code goes???
    @BeforeEach
    /*public void setUp(){


    }*/

    @Test
    public void depositTesting(){
        Customer Karthus = new Customer("Karthus", 002, 1, 1);
        Date today = new Date();
       Karthus.deposit(100, today, "Checking");
       double testNum = 101;
       assertEquals(Karthus.getCheckBal(), testNum,1 );
       assertEquals(Karthus.depositSize(), 1);
       Karthus.deposit(100, today, "Saving");
       assertEquals(Karthus.getSavBal(), testNum, 1);
       assertEquals(Karthus.depositSize(), 2);

    }

    @Test
    public void withdrawTesting(){
        Customer Karthus = new Customer("Karthus", 002, 100, 100);
        Date today = new Date();
        Karthus.withdraw(100, today, "Saving");
        double testNum = 0;
        assertEquals(Karthus.getSavBal(), testNum, 1);
        assertEquals(Karthus.withdrawSize(), 1);
        Karthus.withdraw(100, today, "Checking");
        assertEquals(Karthus.getCheckBal(), testNum, 1);
        assertEquals(Karthus.withdrawSize(), 2);
        Karthus.withdraw(100, today, "Checking");
        assertEquals(Karthus.getCheckBal(), testNum, 1);
        assertEquals(Karthus.withdrawSize(), 2);

    }
    @Test
    public void depositstringTesting(){
        Customer Karthus = new Customer("Karthus", 002, 100, 100);
        Date today = new Date();
        Karthus.deposit(100, today, "Checking");
        String expected = ""+Karthus.getDeposit(0);
        assertEquals(expected, "Deposit of: $"+100.0+" Date: "+today+" into account: "+"Checking");




    }
    @Test
    public void withdrawstringTesting(){
        Customer Karthus = new Customer("Karthus", 002, 100, 100);
        Date today = new Date();
        Karthus.withdraw(100, today, "Checking");
        String expected = ""+Karthus.getWithdraw(0);
        assertEquals(expected, "Withdrawal of: $"+100.0+" Date: "+today+" from account: "+"Checking");



    }

}
