public class Calendar {
    public static void main(String[] args) {
        String day = "Friday"; //Can be any day.
        System.out.println("Hey, are you free on " + day + "? \n");


        System.out.println("Hmm, let me check my calendar.");
        System.out.println("WHAAAT???"); //Just found out you can just type sysout
        
        switch(day){//Check calendar here:

            case ("Monday") : System.out.println("Sorry, I have to stay at work late."); break ;  //  "Monday": print ("Sorry, I have to stay at work late."); 
            case ("Tuesday") : System.out.println("It looks like I have meetings all day"); break; //  "Tuesday": print ("It looks like I have meetings all day."); 
            case ("Wednesday") : System.out.println("I have a dentist appointment. Some other time!");  break ;//  "Wednesday": print ("I have a dentist appointment. Some other time!"); 
            case ("Thursday") : System.out.println("Sorry, thursday is date night!");  break ;//  "Thursday": print ("Sorry, thursday is date night!"); 
            case ("Friday") : System.out.println("I'm free!!");  break ;//  "Friday": print ("I'm free!!"); 
            case ("Saturday") : System.out.println("I'm free!!");  break ;//  "Saturday": print ("I'm free!!"); 
            case ("Sunday") : System.out.println("I'm free!!");  break ;//  "Sunday": print ("I'm free!!"); 
            default :  System.out.println("that's not a day."); 
        }
    }
}


//Switch statement -acts as a switch.If there is no break ,every case afterwards will run 
// switch (value) {
//  case value1 : some code ;
//    case value2 : some code ; 
//    default  - should leave a code for an error 
//nextLine captires every value on the next line including all the whitespace between each value 

//