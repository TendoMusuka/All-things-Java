/** Loops : 
 * for loop - how many times you need to run a code
 * while loop - runs through until a specific condition
 * print - prints the String and does not move to a new line
 * println - starts on the same line prints the text and then add a new line after the message is displayed
 * Remember return breaks a function so has the power to exit a while loop
 * 
 */


public class Loops {

    public static void main(String[] args) {
        for (int i =1 ; i<=3 ; i++ ){
            System.out.println(i);
        }
    /**
    * The only the while loop runs until a certain conditions
    *With a while loop remember to check if your initial condition is true or not
    */
    int number =0;
    while (number  <3){ //terrible use of while loops since you know how many times it will run for 
        number++;
        System.out.println(number);
    }

    double choice = 0.01;
    double guess = 0.99;

    while (guess<choice){
        guess = Math.random();
        System.out.println(guess) ;
    }

    /** Break and continu
     *  Continue - skips a run and continues to the next one
     * The main difference between break and continue is break is used for immediate termination of loop
     * Whereas continue terminates the current iteration 
     * Nested loop is a loop inside a loop 
     */

    for (int i =1 ; i<=15; i++ ){
        if (i%2 != 0 ){ //check is it an odd
        continue; // this function only prints an even number s
        }
        System.out.println(i);
    }
    
    }

}



