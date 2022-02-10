public class BooleanNotes {

    public static void main(String[] args) {
        //Boolean can store true and false 
        boolean bool1 =true ;
        boolean bool2 =false;

        System.out.println(bool1);
        System.out.println(bool2);

        //useful for comparison

        String sentence = " I love this course!" ;
        String sentence2 = " I love this course!" ;

        sentence.equals(sentence2) ; //you can use variable.equals(variable2) for string comparison
        System.out.println(!sentence.equals(sentence2)) ; // not equal to for string 


    }
}