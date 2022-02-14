import java.util.Arrays;

public class Flight {
    public static void main(String[] args) {

        //STEP 1 - CREATING AN OBJECT
        // Person Rayan = new Person();
        // Rayan.name = "Ryan Slim";
        // Rayan.nationality = "Canadian";
        // Rayan.dateOfBirth = "01/01/1978" ;
        // Rayan.seatNumber = 5;

        // // Rayan.passport [0] = Rayan.name;
        // // Rayan.passport [1] = Rayan.nationality;
        // // Rayan.passport [2] = Rayan.dateOfBirth; 

        // Rayan.passport = new String [] {
        //     Rayan.name, Rayan.nationality, Rayan.dateOfBirth
        // } ; // this is better than what you had done

        // System.out.println(Rayan.name);
        // System.out.println(Arrays.toString(Rayan.passport));


        //USING A CONSTRUCTOR - Challenge 
        Person Tendo = new Person ("Rutendo Musuka", "Zimbabean", "06/12/1999", 8);
        System.out.println(Tendo.getName());

        //Person Ruvimbo =new Person(Tendo); //Ruvimbo steals Tendo's identity

    
    
        Tendo.setPassport();
        
        System.out.println(Tendo);

    }
}
