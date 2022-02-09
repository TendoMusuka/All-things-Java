/**Rutendo Musuka's code
 * Udemy Java Bootcamps Notes, Workshops and Challenges 
 * Learn to get values from users and use it
 */
import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");

        System.out.println("\nName?");//Ask for their first name.
        String name = scan.nextLine();

        System.out.println("\nSurname?"); //Ask for their last name.
        String surname = scan.nextLine();

        System.out.println("\nUsername");//Ask them to make a username.
        String Username = scan.nextLine(); //scan.NextLine has to come before any scan.nextInt

        System.out.println("\nAge");//Ask: how old are you?
        int age = scan.nextInt();

        scan.nextLine(); //put a throw away so line gets skipped since you have used scan.nextInt
        System.out.println("\nLanguage?");
        String language = scan.nextLine();

       

        

        System.out.println("Thank you for joining JavaGram!");

        //Print their information like so:

        System.out.println(name + " "+ surname + "," + age + "," + Username + ".") ;

        //close scanner. It's good practice :D ! 
        scan.close();

        // \n - new line
        // \t - tab
        // \r - return
    }
}