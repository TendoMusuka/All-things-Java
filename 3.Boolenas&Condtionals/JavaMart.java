
public class JavaMart {
    public static void main(String[] args) {
        double wallet = 100;
        
        double toyCar = 5.99;
        System.out.println("Can I get this car?");
       
        if(wallet>toyCar){//if you have enough money
           System.out.println("Sure"); //       print: Sure!
           wallet = wallet - toyCar; } //       pay for the toy car 

      else { //else:  Sorry, I only have <wallet> left.
        System.out.println("Sorry, I only have $"+ wallet + "left." );
      }  

        
        double nike = 95.99;       //run test case with 89.99
        System.out.println("Can I get these nike shoes?");
        if (wallet>nike){//if you have enough money
           System.out.println("Sure!"); //       print: Sure!
        wallet = wallet -nike; }//       pay for the nike shoes 

        else{  //else: Sorry, I only have <wallet> left
            System.out.println("Sorry, I only have $"+ wallet + " left." ); //Do not forget work space
        }
    

        //NOTES!!
        //if statements 
        //If the condition is false it runs the else statement 
        //if (statement ){}
        //else {}
        //Keep in mind > vs >= and < vs <=

    }
}