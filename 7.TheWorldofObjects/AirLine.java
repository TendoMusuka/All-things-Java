public class AirLine {

    //Variables
    private Person[] seats ;

    //Constructor
    public AirLine (Person[] seats){
        this.seats = new Person[11]; //

    }
    
    //Copy Constructors 

    //Getters -number of getters corresponds to the number of fields 
     public Person getPerson( int index ){
        //the person class constructor had already been constructed correctly
        return new Person (seats[index]) ; //by return Person(seats[index]) instead of seats[index], you return a copy instead of a vlue
    }

    //Setters - number of setters corresponds to the number of fields 
    //  public void setPerson(Person person){
    //     this.seats[index] = this


    //  }
    //any other functions 
        //createReservation()

   

}
