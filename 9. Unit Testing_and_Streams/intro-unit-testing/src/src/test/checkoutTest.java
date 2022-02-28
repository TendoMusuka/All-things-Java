package src.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import src.main.Main;

   
public class checkoutTest{
    @Test

    public void subtotalIsValid(){  //first test 
        assertEquals(19.2, Main.getSubtotal()); //assertEquals is comparing the two values 
        
    }

    @Test //got to put this before every test

    public void taxIsValid(){
        assertEquals(2.50,Main.getTax(19.2)) ;  
    }


    @Test
    public void totalIsValid(){
       assertEquals(21.7,Main.getTotal());
    }
}
