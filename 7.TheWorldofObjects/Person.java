import java.util.Arrays;
import java.util.Random;

public class Person { //Person is the object
   
    //fields
    private String name ;  
    private String nationality ;
    private String birthday;
    private String passport [];
    private int seatNumber;


    Random rd = new Random();
    //CONSTRUCTOR 
    public Person (String name,String nationality , String dateOfBirth,int seatNumber){ 
        this.name = name; //this points at the field of the object
        this.nationality =nationality;
        birthday  = dateOfBirth; //date is the field and date of Birth is the parameter 
        this.passport = new String[3] ;
        this.seatNumber = seatNumber;

    }

    

    //Copy Instructor 
    public Person  (Person source) {
        this.name=source.name;
        this.nationality = source.nationality;
        this.birthday=source.birthday;
        this.passport= Arrays.copyOf(passport, passport.length);
        this.seatNumber = source.seatNumber;
    }

    //Defining Getters
    public String getName(){
        return name;
    }
    public String getNationality(){
        return nationality;
    }
    public String getBirthday(){
        return birthday;
    }
    public int getSeatNumber(){
        return seatNumber;
    }

    public String []getPassport(){
        return Arrays.copyOf(passport , passport.length);
    }

    //Defining Setters 
    public void setNamer(String name){
        this.name = name ;
    }
    public void setNationality(String nationality){
        this.nationality= nationality ;
    }
    public void setBirthday(String birthday){
        this.birthday = birthday ;
    }
    public void setSeatNumber(int seatNumber){
        this.seatNumber = seatNumber ;
    }

    public void setPassport(){
        this.passport = new String[] {this.name , this.nationality, this.birthday };
    }

    //ApplyPassport --Randomly determine s
    public boolean applyPassport(){
       
        boolean randomBoolean = rd.nextBoolean();
        return randomBoolean;
    }

    //Randomly selects seat for passanger
    public int chooseSeat(){
        return rd.nextInt(10) +1; 
    }

    public String toString(){
        return 
        "Name: " + name  + "\n" + 
        "Nationality: " + nationality + "\n" + 
        "Date of Birth: " + birthday +  "\n" +
        "Seat Number: " + seatNumber + "\n" +
        "Passport: " + Arrays.toString(passport) ;
    }


}