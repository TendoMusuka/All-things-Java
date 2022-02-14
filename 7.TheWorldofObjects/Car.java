import java.lang.reflect.Array;
import java.util.Arrays;

//Step 1 : creating an object with different fields and no actions
// Methods and Constructors should be public
// Fields should be private : should not have access to a field outside of its class or you might accidentally change it 
//Getters allow you to create a copy of the field
public class Car {
    private String make;   
    private double price ;
    private int year ;
    private String colour;
    private String [] parts; //remember to update constructor each time you update the constructor ,S
   


    //Copy Constructor
    public Car (Car source) {
        this.make= source.make;
        this.price=source.price;
        this.year =source.year;
        this.colour=source. colour; 
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    //Creating a Constructor
    //The constructor sets each field in the current object equal to a parameter
    public Car(String make , double price, int year ,String colour, String[] parts ){ //this is a constructor  and these are parameters
        this.make =make;  //this helps distringuis between parameter and field , this.nake means current object
        this.price =price;
        this.year = year;
        this.colour = colour;
        this.parts = Arrays.copyOf(parts,parts.length); //Remember to import Array
        //this.colour is the field whereas colour is the parameter
        //Java looks for the closest variable within scope and so that is why you put this."variable"

    }

  

    //Creating a Getter
    //Allows you to get a copy of the field to protect you from yourself.
    //The number of getters correspond to the the number of fields

   

    public String getMake(){
        return make;
    }

    public double getPrice(){
        return this.price;  //do not need to include this since there are no paramters
    }

    public int getYear(){
        return this.year; //do not need to include this since there are no paramters
    }

    public String getColour(){
        return this.colour; //do not need to include this since there are no paramters
    }

    public String [] getParts(){
        return Arrays.copyOf(this.parts,this.parts.length);
    }


    //Defining the Makers 
    public void setMake(String make){
        this.make =make;
    }
    public void setPrice (double price){
        this.price = price;
    }
    public void setYear(int year){
        this.year= year;
    }
    public void setColour (String colour){
        this.colour = colour ;
    }


    public void setParts(String[] parts){
        this.parts= Arrays.copyOf(parts,parts.length); //do not equate two arrays to each other otheriwse
        //you are now copying the parts so changing the outside variable has no offect on the field

    }


    //Defining Actions 
    public void drive(){
        System.out.println("Car is travelling at 80kn/hr");
    }

    //toString - makes every string into a sentence

    public String toString(){
        return "Make: " + this.make + "\n" +
               "Price: " + this.price + "\n" + 
               "Year: "  + this.year + "\n"  +
               "Parts: " + Arrays.toString(this.parts) ;
        }
}

