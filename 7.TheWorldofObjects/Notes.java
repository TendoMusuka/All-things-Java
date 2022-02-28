// The dealership sells many types of cars
// A car is identified by its make,price,year and color 
// Every car needs to come with spare parts 
// The dealership app should be able to search for cars based on make and price
// After a sale, the car must drive to the nearest exit

import java.util.Arrays;
public class Notes {

    /**
     * Plan code around objects
     * Define a Car class 
     * Create many Car objects
     * Oject Oriented Programming - Look for related variable and group them up to make an object
     * What to look for :
     * >>objects :things 
     * >>fields :describe each objects 
     * >>actions - what can the object perform
     * 
     * 
     * objects - dealership,cars 
     * fields -make ,colour ,year,price ,color
     * fields - the delarship is identified by the cars 
     * actions - search,sells : dealrship
     * actions - drive : car
     */

     public static void main(String[] args) {
         
        // car is identified by make ,price , year and colour 
        //define an object by the tpe of object and then pass in the fields that describe it
        //Car Nissan = new Car ("Nissan" , 5000 , 2020 ,"red" ) ; //make, price , year , color
        //^^ Car is the class you're creating an object from 
        //nissan is the variable name 
        //Nissa.drive 
        //another name for object is instance 
        

        //STEP 1 - BEFORE INTRODUCTING THE CONSTRUCTOR
        // Car nissan = new Car (); //car object is initialized with null and zeros 
        // nissan.make = "Nissan";
        // nissan.price = 5000;  -Can not use this anymore since you can not directly access a private field
        // nissan.year =2020;
        // nissan.colour ="red" ;

        // Car dodge = new Car();
        // dodge.make = "Dodge";
        // dodge.colour= "blue";
        // dodge.price = 7000;
        // dodge.year = 2021 ;


     
    //STEP 2 : INTRODUCING A CONSTRUCTOR,GETTERS AND SETTERS 
    // If a class has fields it needs to have :
    // 1. Constructors
    // 2. Getters   -returns a copy of the field's value 
    // 3. Setters
    //Car has 4 fields so it needs to have 1 constructor , 4 getters and 4 setters 
    //Constructor runs as soon you create an object 
    String [] parts = { "tires", "keys"};
    Car nissan = new Car("Nissan", 5000,2020,"red",parts);
    Car dodge = new Car ("Dodge", 7000, 2021, "blue",parts);

    // Methods and Constructors should be public
    // Fields should be private : should not have access to a field outside of its class


    //Getters - Making Fields private
    //This means using nissan.colour will not work so you need to use a getter
    //private preserves the state of the object
    //Getter - Method (function) that returns a field's value 
    //A getter is public and lowerCamelCase

    System.out.println(nissan.getColour());
    System.out.println(nissan.getYear());
    


     //Setters - private , lowerCamelCase , receives a parameter 
     //updates the field with a parameter

     nissan.setColour("Jet Black");
     //nissan halved in prices 

     System.out.println(nissan.getPrice());
     nissan.setPrice (nissan.getPrice()/2);
     System.out.println("Nissan price has been halved: $" + nissan.getPrice());

    //  Reference Traps
    //  -Many references to one Object
     
    Car nissan2=nissan; //this does not copy the object but the reference - similar to arrays 
    nissan2.setColour("yellow");
        System.out.println(nissan.getColour());//this proves the reference trap

    //Constructor overload - having more than one constructor 
    //Copy instructor copies every value from one object to another
    //By passing one argument ,java runs the constructor with two parameters. 
    //Do not set object variables equal to eac other. 

    Car nissan3= new Car(nissan);
    //nissan3 is a copy of nissan

    //ADDING AN ACTION to an OBJECT
    //To avoid the getter returning a reference use Arrays.copyOf() function

    nissan3.drive();

    nissan.setParts(new String[] {"doors", "wind screen"});  //this is how you return an array without declarying

        System.out.println(Arrays.toString(nissan.getParts()));

    System.out.println(" ");
    System.out.println("Using the toString function");
    System.out.println(nissan); //toString is special because Java automatically looks for it
    

     Dealership dealership =new Dealership();
     dealership.setCar(nissan, 0);
     dealership.setCar(dodge, 1);
     dealership.setCar(nissan2,2);

    
    }


}

