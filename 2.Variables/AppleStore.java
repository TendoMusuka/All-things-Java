/**Rutendo Musuka's code
 * Udemy Java Bootcamps Notes, Workshops and Challenges 
 */
public class AppleStore {
    public static void main(String[] args) {
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;


        System.out.println("You picked 500 apples from an apple orchard");
        numOfApples+=500;
        
        System.out.println("Time for business! You're selling each apple for 40 cents");
       
        double price = 0.4;   //Make a price variable. Set it equal to 40 cents.
        System.out.println("One customer walked in. He bought 4 apples!");
        numOfApples = numOfApples-=4 ;//Update number of apples.
        numOfCustomers++ ; //Update number of customers;
        profit = numOfApples*price ; //Update profit

        System.out.println("Another customer walked in. He bought 20 apples!");
        numOfApples-=20 ; //Update number of apples;
        numOfCustomers++ ; //Update number of customers;
        profit = numOfApples*price ;//Update profit

        System.out.println("Another customer walked in. She bought 200 apples!");
        numOfApples -=200 ; //Update number of apples
        numOfCustomers++ ; //Update number of customers  -Remember Java is caps sensitive ; check your spelling
        profit = (500 - numOfApples)*price ; //Update profit

        //cannot find symbol might mean your variable aint spelt correctly 
        System.out.println("Wow! So far, you made: $" + profit);
        System.out.println(numOfCustomers + " customers love your apples.");
        System.out.println("You have " + numOfApples +  " apples left. We'll sell more tomorrow!");
        //remember to leave workspaces 


        //TYPE-CASTING!!!
        //how to convert double to int 
        //presents numbers in a neat way

        double decimal =4.3 ;
        int integer ; 

        integer = (int) decimal; 
        System.out.println (integer) ;

    }

}