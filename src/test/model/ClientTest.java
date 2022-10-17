package model;

import model.Client;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class ClientTest {

    Client c1;
    Client c2;
    Client c3;

    @BeforeEach
    void runBefore(){
        c1 = new Client("Rahul",12000,"SWE@Google");
        c2 = new Client("Mike",20000,"CTO@Meta");
        c3 = new Client("Tim",250000,"CEO@Apple");

    }
    @Test
    void testReturnAmt(){

        assertEquals(2640,c1.returnAmt());
        assertEquals(4600,c2.returnAmt());
        assertEquals(62500,c3.returnAmt());

    }
    @Test
    void testaddEntries(){
        List<Object> test1 = Arrays.asList("S&P500",2000,7000,"Wealthsimple");
        assertEquals(test1.size(),c1.addEntries("S&P500",2000,7000,"Wealthsimple").size());
        assertEquals(test1,c1.addEntries("S&P500",2000,7000,"Wealthsimple"));
        List<Object> test2 = Arrays.asList("VOO",2000,9000,"RBC");
        assertEquals(test2.size(),c1.addEntries("VOO",2000,9000,"RBC").size());
        assertEquals(test2,c1.addEntries("VOO",2000,9000,"RBC"));
        List<Object> test3 = Arrays.asList("TESLA",2000,7000,"Century");
        assertEquals(test3.size(),c1.addEntries("TESLA",2000,7000,"Century").size());
        assertEquals(test3,c1.addEntries("TESLA",2000,7000,"Century"));

    }

    @Test
    void testManageYourExpenses(){

       c1.manageYourExpenses(20,20,20,20);
       assertEquals(c1.getGrocPerc(20),c1.expenses.get(0));
       assertEquals(c1.getEntPerc(20),c1.expenses.get(1));
       assertEquals(c1.getFoodPerc(20),c1.expenses.get(2));
       assertEquals(c1.getMisItemsPerc(20),c1.expenses.get(3));

       assertTrue(c1.expenseNames.contains("groceries"));
       assertTrue(c1.expenseNames.contains("entertainment"));
       assertTrue(c1.expenseNames.contains("food"));
       assertTrue(c1.expenseNames.contains("miscellaneous items"));

        c2.manageYourExpenses(75,90,100,45);
        assertEquals(c2.getGrocPerc(75),c2.expenses.get(0));
        assertEquals(c2.getEntPerc(90),c2.expenses.get(1));
        assertEquals(c2.getFoodPerc(100),c2.expenses.get(2));
        assertEquals(c2.getMisItemsPerc(45),c2.expenses.get(3));

        assertTrue(c2.expenseNames.contains("groceries"));
        assertTrue(c2.expenseNames.contains("entertainment"));
        assertTrue(c2.expenseNames.contains("food"));
        assertTrue(c2.expenseNames.contains("miscellaneous items"));

        c3.manageYourExpenses(125,110,190,115);
        assertEquals(c3.getGrocPerc(125),c3.expenses.get(0));
        assertEquals(c3.getEntPerc(110),c3.expenses.get(1));
        assertEquals(c3.getFoodPerc(190),c3.expenses.get(2));
        assertEquals(c3.getMisItemsPerc(115),c3.expenses.get(3));

        assertTrue(c3.expenseNames.contains("groceries"));
        assertTrue(c3.expenseNames.contains("entertainment"));
        assertTrue(c3.expenseNames.contains("food"));
        assertTrue(c3.expenseNames.contains("miscellaneous items"));
    }
    @Test
    void testViewYourInvestment(){
        c1.viewInvestment("S&P500",2000,7000,"Wealthsimple");
        assertEquals("S&P500",c1.inv.get(0));
        assertEquals(2000,c1.inv.get(1));
        assertEquals(7000,c1.inv.get(2));
        assertEquals("Wealthsimple",c1.inv.get(3));

        c2.viewInvestment("V00",5000,100000,"Century Brokers");
        assertEquals("V00",c2.inv.get(0));
        assertEquals(5000,c2.inv.get(1));
        assertEquals(100000,c2.inv.get(2));
        assertEquals("Century Brokers",c2.inv.get(3));

        c3.viewInvestment("Tesla", 1000, 2000,"HDFC Bank");
        assertEquals("Tesla",c3.inv.get(0));
        assertEquals(1000,c3.inv.get(1));
        assertEquals(2000,c3.inv.get(2));
        assertEquals("HDFC Bank",c3.inv.get(3));



    }







}