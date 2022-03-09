/**
*Purpose:      Design Hangman  game
*Author:       Rutendo Musuka
*/

import java.util.Random;
import java.util.Scanner;

public class Hangman {

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static void main(String[] args) {
        int missCounter =0; //keeps track of the number of wrong guesses 
        String missedLetters = ""; //keeps track of the letters the user guessed wrongly
        char letterGuessed =' '; //The letter guessed by the user during the round played 
        String correctGuesses =""; //displays the letters guessed correctely by user in the right order
        Scanner scanner = new Scanner(System.in) ;

        //Welcome user to the game
        System.out.println("Welcome to hangman! I hope you win");
    
        //Game chooses random word from the list 
        String wordGenerated = getRandom(); //returns a random word from the list of array
        System.out.println("The game has determined a word");

        //Initial display of an empty list for hangman 
        //counts the number of letters in the word generated and produces ____
        int wordGeneratedLength = wordGenerated.length();
        for (int i = 0; i < wordGeneratedLength; i++) {
            correctGuesses = correctGuesses + "_" ;
        }
        
        //while guessCounter <=6 and the word has not been guessed correctly, the user should keep playing 
        while (missCounter<6 && !(correctGuesses.indexOf('_')==-1) ){
                System.out.print("Guess a letter : ");
            
            //Ask user for the input and throw an exception if it aint a letter 
            try {                 
                letterGuessed =  scanner.next().charAt(0);  //gets the guessed letter from the user 
            }
            catch (Exception e) { 
                System.out.println("Please guess one letter only! No numbers or character");
                continue; //if they guess anything other than letter 
            }
            //determine if the letter guessed is correct of not 
            if( wordGenerated.contains(String.valueOf(letterGuessed))){  //checks if the letter is in the random word
                 correctGuesses = updatedCorrectGuess(letterGuessed, correctGuesses, wordGenerated);
            }
            //If the word does not contain the letter, increase miss Counter and add the letter to the collection of wrongly guessed letters
            else{ 
                missCounter++;
                missedLetters = missedLetters + " " + letterGuessed; 
            }

            //Needs to display the updated screen after each round 
            
            System.out.println(".................................................................");
            displayScreen(correctGuesses, letterGuessed, gallows[missCounter], missedLetters);
        }
        scanner.close();

        //Display end of the game screen : Display a win vs a loss
        if (missCounter<6){ //if counter is less than 6 by end of game the player has won
            System.out.println("You have won!! Congratulations." + "\n" +
            "You correctly guessed the word:" + wordGenerated);
        }
        else{ //Tell the gamer has lost and display the correct word 
            System.out.println("Better luck, next time!" + "\n" + 
            "The word was" + wordGenerated );
        }

        

    }

        /** Function : Word generator
         * Randomly generates a word from the string array 
         * @ parameter no parameters 
         */

        public static String getRandom(){
            int rnd = new Random().nextInt(words.length);
            return words[rnd];
        }
        /**Displays the screen
         * Displays the letter guessed ,gallows ,word guess ,misses 
         * @wordGuessed
         * @parameter letterGuessed: letter put in by user 
         * @parameter words: determines which shallow to display 
         */
        
        public static void displayScreen(String displayCorrectGuesses,char letterGuessed, String shallows,String missedLetters){

            System.out.println(
                "Guess: " +  letterGuessed + "\n" + 
                shallows + "\n" + 
                "Word:  "  + displayCorrectGuesses + "\n" + 
                "Misses:  "  + missedLetters 
                );
            
        }

        /**updatedCorrectGuess
         * Updates the out with the correct guess
         * @parameter String wordGenerated : the word guessed 
         * @paramter char letterGuessed
         * @parameter String correctGuesses 
         * output - the new display of letters correctly guess 
         */

         public static String updatedCorrectGuess(char letterGuessed, String correctGuesses, String wordGenerated){
            int index = wordGenerated.indexOf(letterGuessed); //returns position of first appearance of the letter 
            correctGuesses = correctGuesses.substring(0,index) + letterGuessed + correctGuesses.substring(index+1); //updates display of coorectGuesses with letter at first position

            //updates display of coorectGuesses at the rest of the indexes if the letter is found at more than one position
            while( index>= 0 ){  
                index = wordGenerated.indexOf(letterGuessed,index + 1);
                if (index == -1){
                    break;
                } 
                correctGuesses = correctGuesses.substring(0,index) + letterGuessed + correctGuesses.substring(index+1); 
            }

            return correctGuesses;
         }

}





