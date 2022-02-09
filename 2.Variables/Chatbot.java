/**Rutendo Musuka's code
 * Udemy Java Bootcamps Notes, Workshops and Challenges 
 */

import java.util.Scanner; //import Scanner

public class Chatbot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        String name = scan.nextLine(); //Pick up user's name and store it. 

                           
        System.out.println(""); //add new a line before asking next question.  
        //Having println and \n prints two empty lines
        System.out.println("Hi " + name + "! I'm Javabot. Where are you from?");
        String home = scan.nextLine(); //Pick up user's home and store it. 
                        

        System.out.println("");//add new a line before asking next question.
        System.out.println("I hear it's beautiful at " + home + "I'm from a place called Oracle");
        System.out.println("How old are you?");
        double age = scan.nextInt();

        scan.nextLine(); 

        System.out.println(" "); //add new a line before asking next question.
        System.out.println("So you're "+ age + ". Cool! I'm 400 years old.");
        System.out.println("This means I'm " + (int)(400/age) + " times older than you."); //casted it to make it look neater

        System.out.println(" "); 
        System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
        String language = scan.nextLine(); //Pick up language and store it. 


        System.out.println(" ");//add new a line here.
        System.out.println(language + ", that's great! Nice chatting with you," + name + ". I have to log off now. See ya!");
    
        scan.close();//close scanner. 

    }
}
