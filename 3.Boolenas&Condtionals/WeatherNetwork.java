 /**Rutendo Musuka's code
  * Udemy Java Bootcamp's Workshops, challenges and projects
  */
  
  public class WeatherNetwork {
    public static void main(String[] args) {

        int temp = -10;  

        String forecast = "";

        //IF - ELSE IF - ELSE STATEMENTS HERE!

        if (-15<temp && temp <-1) {//if temp between -15 and -1: "The forecast is FREEZING! Stay home!"
        System.out.println("The forecast is FREEZING! Stay home!");
        }
        else if (temp>-1 && temp <10 ) {//if temp between 0 and 10: "The forecast is Chilly. Wear a coat!";
        System.out.println("The forecast is Chilly. Wear a coat!");}
        else {
            System.out.println("It's warm. Go outside!"); } ;//else: It's warm. go outside!

        System.out.println(forecast);

        //LOGICAL OPERATORS!!!
        // || - OR  comparison
        // && - And comparison 
         
        if (true || false ){
            System.out.println("One of the two comparisons are true");
        }
    }
}

