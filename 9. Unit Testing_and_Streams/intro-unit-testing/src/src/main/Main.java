package src.main;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Main {
    
    static double[] prices = new double[] {2.23, 1.32, 4.32, 11.33};

    public static void main(String[] args) {   

    double tax = getTax(19.2);

    }



public static double getSubtotal(){

    double temp =0;
    for (int i = 0; i < prices.length; i++) {
        temp+=prices[i];
    }
    //return 0;  //the first test got to fail
    return temp ;
}

public static double getTax(double subtotal){
    double tax = subtotal* 0.13;  //round off to two decimal 
    String taxString = String.format("%.2f",tax);

    return Double.parseDouble(taxString);
}

public static double getTotal () {
     double total = getTax(getSubtotal()) + getSubtotal();
     String totalString = String.format("%.2f",total);

     return Double.parseDouble(totalString);
 }



}