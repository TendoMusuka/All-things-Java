/**Rutendo Musuka's code
 * Udemy Java Bootcamps Notes, Workshops and Challenges 
 */
public class Points {

    //SEMICOLONS BABBBY -you keep forgetting those 
    //You have to be in the directory to run and compile the code
    //javac '.\Workbook 2.1\Points.java' since Points.java is in Workshop 2,1
    //java '.\Workbook 2.1\Points.java'
    public static void main(String[] args) {
        int points = 0;
        String sentence = "Number of passengers" ; 

        System.out.println("Harry was caught wandering the halls. -50 points for Gryffindor");
        points -=50 ; //update points here
        System.out.println("Harry was being cheeky in class. -3 points for Gryffindor");
        points -=3 ; //update points here
        System.out.println("Hermione got full marks on Lockhart's quiz. 30 points for Gryffindor");
        points += points ;//update points here
        System.out.println("Ron won the underground chess game. 100 points for Gryffindor");
        points +=100 ; //update points here
        System.out.println("Harry defeated Quirrell. 60 points for Gryffindor");
        points += 60 ; //update points here

        System.out.println(sentence);
        System.out.println(points); //Print the variable

        //STRINGS 
        //Do not forget white space 
        String intro = "My name is ";
        String name = "Rutendo" ;
        String anouncements = "Points for Gryf: " ; //do not forget the white space 
        System.out.println(intro +name);
        System.out.println(anouncements+points);
        anouncements = "End of announcements" ; 
        System.out.println(anouncements);

        char gender = 'F'; //remember it is single quotes instead of double quotes....C
        System.out.println("Gender: " + gender);
    }
}

