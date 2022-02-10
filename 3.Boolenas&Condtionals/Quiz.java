 /**Rutendo Musuka's code
  * Udemy Java Bootcamp's Workshops, challenges and projects
  */
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        String number1= scan.nextLine(); //store answer 1

        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        String number2= scan.nextLine();//store answer 2

        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        String number3= scan.nextLine();//store answer 3

        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
        String number4= scan.nextLine();//store answer 4

        int score = 0;

        //Task 2: Check each answer - For each correct answer, add 5 points to the score. 
        //ans to a is 1.c
        if(number1.equals("c")){
            score++;
        }

        if(number2.equals("a")){
            score++;
        }

        if(number3.equals("d")){
            score++;
        }

        if(number4.equals("a") || number4.equals("b")){
            score++;
        }

        
        
        System.out.println("Your final score is: " + score + "/20");

        scan.close();

    }
}