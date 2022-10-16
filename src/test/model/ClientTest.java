package model;


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
    void testViewInvestments(){
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







}