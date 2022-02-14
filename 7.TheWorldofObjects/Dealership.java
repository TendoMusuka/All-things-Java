// The dealership sells many types of cars
// A car is identified by its make,price,year and color 
// Every car needs to come with spare parts 
// The dealership app should be able to search for cars based on make and price
// After a sale, the car must drive to the nearest exit

import java.util.Arrays;

public class Dealership {
    private Car []  cars;

    //Create a Constructor
    public Dealership(){
        this.cars =new Car[3] ;
        //System.out.println(Arrays.toString(this.cars));

    }

    //Create Getters 

    //Create Setters 
    // the setter only updates one object
    //The setter lets the user choose which one 
    public void setCar(Car cars , int index){ 
        this.cars[index] =new Car (cars); //remember Car makes a copy 

    }

    public Car getCar(int index){
        return new Car(this.cars[index]);
    }

    //.toString function
    public void sell(int index){
        this.cars[index].drive(); //since it is old the customer gets to drive it away
        this.cars[index]= null; //set the car to null since it don't exist no more 
    }

    public String search(String make, int budget) {
        
        for (int i = 0; i < cars.length; i++) {
            if (this.cars[i] == null){ //account for an array that is empty 
                continue ;
            }
            if (this.cars[i].getMake().equals(make)  && this.cars[i].getPrice() <= budget){
                return "\n we found one in spot" + i  + "\n" + this.cars[i].toString() + "\n Are you interested" ;
            }
        }
        return "Sorry , we could not find any cars";
    }

    public String toString(){
        String temp = " ";
        for (int i = 0; i < cars.length; i++) {
            temp += "Parking Spot : " + i + "\n" ;
            if (this.cars[i] == null){
                temp+="Empty \n" ;
            } else {  
            temp += this.cars[i].toString() + "\n" ;
            }

        }
        return temp ;
    
    }
}
