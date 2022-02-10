public class EvenOrOdd {
    public static void main(String[] args) {
        // Task 1 – Make a for loop that counts from 0 to 19. 
        
        /* Task 2
             
            1. If the number is even, print ' – even' beside the number.
            2. If the number is odd, print ' – odd' beside the number.

         */
        int num =19;
        for (int i=0; i<=num ; i++){
            System.out.print(i + " ");
            if (i%2 == 0 ){
                System.out.println("- even");
            }
            else {
                System.out.println("- odd");
            }

        }

    }
}
