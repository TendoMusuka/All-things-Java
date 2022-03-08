import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFiles {
    public static void main(String[] args) {
    
       try {
        FileInputStream fis = new FileInputStream("Greetings.txt") ;
        Scanner scan = new Scanner(fis);
        while (scan.hasNextLine()){   //while there is something in the nextline 
            System.out.println(scan.nextLine());
        }
        scan.close();
        } catch (FileNotFoundException e) {
           System.out.println(e.getMessage()); //Try putting in an invalid name and you will see it will run this line 
       }
       

    }
}


/** High chance a user is going to put in a bad name so Java forces you to catch this exception  */
