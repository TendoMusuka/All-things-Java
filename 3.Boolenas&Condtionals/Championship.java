 /**Rutendo Musuka's code
  * Udemy Java Bootcamp's Workshops, challenges and projects
  */
public class Championship {
    public static void main(String[] args) {

        int gryffindor = 450;    //gryffindor points
        int ravenclaw = 500;    //ravenclaw points

        int margin = gryffindor - ravenclaw ; // int margin = amount of points by which gryffindor scored over ravenclaw;


        if (margin>=300){  //if gryffindor wins by a margin of 300 points:
           
             System.out.println("Gryffindor takes the house cup!") ; }//print: 

        else if(margin>=0) {//if gryffindor wins by a margin of any points: 
            System.out.println("In second place, Gryffindor!") ;//print: In second place, Gryffindor!
        }
        else if (margin>=-100) {//if gryffindor loses by a margin of 100 points, they are third:
          System.out.println("In third place, Gryffindor!");  //print: In third place, Gryffindor!
        }

        else{//else:
        System.out.println("In fourth place, Gryffindor! ") ;  //print: In fourth place, Gryffindor! 
        }
    }
}