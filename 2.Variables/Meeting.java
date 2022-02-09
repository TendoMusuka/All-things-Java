/**Rutendo Musuka's code
 * Udemy Java Bootcamps Notes, Workshops and Challenges 
 */
import java.util.Scanner;  //you should import Scanner in order to get input from user 
public class Meeting {
    public static void main(String[] args) {
        double sales = 24309.65; 
        double profit = 18562.18; 
        double refunds = 688.78; 
        double shipping = 1233.57; 

        System.out.println("This month, we made $" + (int)sales + " in sales");
        System.out.println("Factoring in costs, we made $" + profit + " in profit");
        System.out.println("The refunds are at a low $" + refunds + ". This is a good sign!");
        System.out.println("Shipping costs were high. We paid $" +  shipping +  " in shipping");


//SCANNER 
//need to import Scanner : import java.util.Scanner
//Scanner(1) scan(2) = new Scanner (System.in) (3)
//1- The type is Scanner 
//2- Variable name 
//3 - A new Scanner value
        Scanner scan  = new Scanner (System.in); //scanner get value from user 
        int counter=0 ;

        System.out.println("\nEnter your name?"); //for some reason you need to ask for all string input first before any numbers 
        String name =  scan.nextLine() ; //if you put this line after scan.nextInt it wont work
        System.out.println(name);
        counter++;

        System.out.println("\nEnter your surname?"); //for some reason you need to ask for all string input first before any numbers 
        String surname =  scan.nextLine() ;
        System.out.println(surname);
        counter++; 

        System.out.println("\nHow old are you?");
        int age = scan.nextInt() ; //scan pics integer and stores it into the variable
        System.out.println(age); 
        counter++;

        System.out.println("\nEnter an integer");
        double decimal = scan.nextDouble(); //String is in caps baby girl!!!!!!!!!!!!
        System.out.println(decimal); 
        counter++;

        scan.close(); //Close scanner after you done using it to avoid a memory leak
        
       
        //scan.Int -gets integers
        //scan.Double - gets doubles 
        //scan.nextLine - gets strings
        // \n - goes to the next line  


    }
}

