//Rutendo Musuka's code
//Let's play tic tac toe

import java.util.Scanner;

public class TicTacToe {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
            System.out.println("\nLet's play tic tac toe");

            
            //Task 1: Create an array with three rows of '_' characters.
            char array [][] = {  //remember to use char instead of string when you 
              {'x','o','x'},
              {'o','x','o'},
              {'x','o','o'},
            } ;
            System.out.println(checkWin(array));// -checks if checkWin works

            //Task 2: Call the function printBoard();
            printBoard(array);
             
              /*
              {  Task 3: Loop through turns.

                  if (X) turn {
                     Task 4: call askUser(). 
                     Task 5: populate the board using askUser's return value.
                  } else {
                      Task 4: call askUser(). 
                      Task 5: populate the board using askUser's return value. Then, print it.

                  }*/

                  /*Task 6 - Call the function.
                   if return value == 3 {
                     print: X wins and break the loop
                  } else if return value == -3 {
                     print: O wins and break the loop
                  }

              } */
              
               
                  for( int turn=0; turn<9 ;turn++){
                    if (turn%2 ==0){ //x plays every even turn
                      System.out.println("x please play");
                      int positionX[] = askUser(array);
                      array[ positionX[0] ] [ positionX[1] ]  = 'x' ;
                      System.out.println("x played");
                      printBoard(array);
              
                    
                      if (checkWin(array) == 3) {
                        System.out.println("x wins");
                        break; } 
                      
                      //contnue with 
                      }

                    else {  //nested if - the if goes to the last if 
                      System.out.println("o please play");
                      int positionO[] = askUser(array);
                      array[ positionO[0] ] [ positionO[1] ]  = 'o' ;
                      printBoard(array);
                      System.out.println("o played");
              
                    if (checkWin(array) == -3) {
                      System.out.println("o wins");
                     break;
                    }
                    } 
                  }

              

                

    
              

            scan.close();
        }


    /** Task 2 - Write a function that prints the board.
     * Function name - printBoard()
     * @param board (char[][])
     * 
     * Inside the function:
     *   1. print a new line.
     *   2. print the board.
     *      • separate each row by two lines. 
     *      • each row precedes a tab of space
     *      • each character in the grid has one space from the other character
     */  

     public static void printBoard(char board[][]){
       for(int i=0 ;i<3 ;i++){
        for(int j=0 ;j<3 ;j++) {
        System.out.print(board[i][j]+ " ");}
        System.out.println();
        System.out.println();
       }


     }

   /** Task 4 - Write a function that lets the user choose a spot
     * Function name – askUser
     * @param board (char[][] board)
     * @return spot (int[])
     * 
     * Inside the function
     *   1. Asks the user: - pick a row and column number: 
     *   2. Check if the spot is taken. If so, let the user choose again.
     *   3. Return the row and column in an int[] array.
     * 
     */

    public static int[] askUser (char[][] board) {
      System.out.println("Pick the row & column: ");
      int row = scan.nextInt(); 
      int column = scan.nextInt();
      
      //System.out.println(board[row][column]);
      while (board[row][column] != '_') {
        System.out.println("Pick another row & column");
        //System.out.println(board[row][column]);
        row =scan.nextInt();
        column = scan.nextInt();
      } 

      int newPosition[] = {row,column};
      return  newPosition;

      
    }



    /** Task 6 - Write a function that determines the winner
     * Function name - checkWin 
     * @param board (char[][])
     * @return count (int)
     * 
     * Inside the function:
     *   1. Make a count variable that starts at 0.
     *   2. Check every row for a straight X or straight O (Task 7).
     *   3. Check every column for a straight X or straight O (Task 8).
     *   4. Check the left diagonal for a straight X or straight O (Task 9).
     *   5. Check the right diagonal for a straight X or straight O (Task 10).
     */

     public static int checkWin (char board[][]){


      //Checking rows for a win
      int count =0;
      for ( int i=0 ; i <3 ;i++){
      count=0; //for each column ,you want to start the counter at 0
        for (int j=0; j<3 ; j++){ //this loop checks if the current row is a win
         if (board[i][j] == 'x'){
          count++;}
        else if (board[i][j] == 'o'){
          count--; }
        } 
        if (count==3 || count==-3){  //if one of the rows is a match it returns count
          return (count);
        }
      }

      



      //Checking columns for a win
      count =0 ; // if there are no rows that call for a win, you got to make sure you reset counter
      for ( int i1=0 ; i1 <3 ;i1++){
        count=0;   //for each row ,you want to start the counter at 0
        for (int j1=0; j1<3 ; j1++){
         if (board[j1][i1] == 'x'){
          count++;}
        else if (board[j1][i1] == 'o'){
          count--; }
        }
        if (count==3 || count==-3){ //after checking each row ,determine whether or not to there is a win
          return (count); 
      }}

      //if one of them is a match it returns 

       count =0;
       //checking for a top left to bottom right diagonal win   ---WORKS
       for (int i2=0 ; i2<3 ;i2++) {
        if (board[i2][i2] == 'x'){
          count++;}
        else if (board[i2][i2] == 'o') {
          count--; 
        }
        if (count==3 || count==-3){ //after checking left to right diagonal ,
          return (count);}
      }
      count =0;
      //checking for a right to left diagonal 
      for (int i3=0 ; i3<3 ;i3++) {
        if (board[i3][2 -i3] == 'x'){
          count++;}
        else if (board[i3][2 -i3] == 'o') {
          count--; 
        }
        if (count==3 || count==-3){ //after checking right to left diagonal ,
          return (count);}
      }

      return count; 
      


     }


}
