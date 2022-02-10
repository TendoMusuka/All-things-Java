 /**Rutendo Musuka's code
  * Udemy Java Bootcamp's Workshops, challenges and projects
  */

public class WorkSchedule {
    public static void main(String[] args) {
        int day = 6;  
        boolean holiday = false;
         
        // if it's a holiday, print: "woohoo, no work!");
        // if it's the weekend, print: "it's the weekend, no work!"
        // otherwise, print: "Wake up at 7:00 :( ";

        if (holiday){
            System.out.println("woohoo, no work!");
        }
        else if ( day==6 || day==7){
            System.out.println("it's the weekend, no work!");
        }
        else{
            System.out.println("Wake up at 7:00 :(");
        }

    }

}
