//Functions Notes 
//Never copy code - that is 
//public void name (int param){} - level of access, return value , function name , parameters ,{code}
//note the difference between parameters and arguments 
// Parameters are values the function expects to receive. Argumenst are the values being passed in
public class  Functions{

    public static void main(String[] args) {  // main runs the job of running your application 
       
        singChorus();
        singChorus();
        singChorus();
        triangle(2.2 , 4.3); //what you feed when you call the function are arguments
        //order of your arguments matters 
        
        double area2 = triangleCalcultor(4.4 ,9.1, "perimeter");
        System.out.println(area2);
        double sine = Math.sin(1.2); //returns the sine of the parameter
        double random = Math.random(); //returns random value between 0 and 1 
        //To find out what a function does and its parameters , you can hover above it 
    }


public static void singChorus () {   //whether you have parameters or not the () always needs to be there 
    System.out.println( "Chorus line 1") ; //functions should be lowerCase Camel
    System.out.println( "Chorus line 2") ;
    System.out.println( "Chorus line 3") ;
    System.out.println( "Chorus line 4") ;

}

public static void triangle( double length ,double width){ //parameters - values functions expect to receive 

    double area = 0.5*width*length;
    System.out.println( area) ;

}
// Allowing your function to return a value 
//return makes Java exit the code
//return is always the last thing that runs in a function

public static double triangleCalcultor(double length ,double width, String option){
    if ( length<0 || width<0 ){
        return 404;
    }
    else {
    switch (option){   
        case "area" : return  0.5*width*length;
        case "perimeter" : return 2* (length + width) ;
        default  : return 404 ;
    }
}
   

}
/**
 * Function name : greet
 * @param :no param 
 * Inside the function:
 * This function prints HEEEYYY!! as a greeting */
 public static void greet(){
     System.out.println( "HEEEYYY!!");
 }
}

//Doc comments example
/** Function name : fahrenheithtoCelsius - converts fahrenheit to celcius,
 * @ param fahrenheit (double)
 * @ param celsius double
 * Inside the function:
 *  1. return the celsius temperature C = (F-32) * 5/9
 */

 /**
  * Class - contains all of your code 
    Functions - contains a group of your code
    Main Function - is what runs when you run your code
    Function scope - variable is out of scope outside the function ie it stops existing 
                 If you define a variable in main , it only exists inside main is invalide outside 
    Class scope - the variable spans over the entire function

    println is a function 
    The reason you have to type System.out is cause you are calling a function that is outside your scope 
  */