/**Rutendo Musuka's code
 * Udemy Java Bootcamp workshops, challenges and projects
 */
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        String mortgage = scan.nextLine();//Task 1 - Pick up the user's decision.

        System.out.println(mortgage) ; // common mistake was using == instead of name.equals("name")
        if( mortgage.equals("yes")) {//Task 2 - Print this if the decision is "yes"
            System.out.println("\nGreat! In one line" +
            "\nHow much money do you have in your savings?" +
            "\nAnd, how much do you owe in credit card debt?");
             double savings = scan.nextInt() ;  // Task 3 - Pick up each value 
             double debt = scan.nextInt() ;     // It does not matter whether you put the integers next together or on the next line 
        
            System.out.println("\nHow many years have you worked for?");
            double workyears = scan.nextInt() ;// Task 4 - Pick up number of years

            scan.nextLine();
            System.out.println("What is your name?");
               String name = scan.nextLine();// Task 5 - Pick up the user's name
                
               //Task 6 - Approve the mortgage if they meet the requirements (see article)
               //       - Otherwise, don't give them a mortgage.
               if(savings>=10000 && debt<5000 && workyears>=2){
               System.out.println("Congratulations " + name + ". You have been approved!");}

               else {
               System.out.println("Sorry, you are not eligible for a mortgage.");
               }
        }

        else {
        //Task 2 - Print this if the decision was not "yes"
        System.out.println("\nOK. Have a nice day!");
        }

        scan.close();
    }
}