public class Main2 {
    public static void main(String[] args) {
        String parts[] = {"tires", "keys"};

        Car[] cars = new Car []{  //this just created an array of type Car
            new Car ("Nissan", 5000, 2020 ,"red", parts),
            new Car ("Dodge", 7000, 2019, "pink", parts),
            new Car ("Toyota", 9000, 2018, "black", new String[] {"tires","filter"}),
        };

        Dealership dealership = new Dealership(); //if you do not define this your dealership becomes 

        for(int i=0; i<cars.length; i++){ //type "fori" to get shortcuts 
            dealership.setCar(cars[i],i);  //if you are getting a static error ,fix it by defining the variable 
        }  //learn the difference between static and non static 

        Car newCar = dealership.getCar(0);
        newCar.setColour("white");
        System.out.println(newCar);

        dealership.sell(2);        //Creates a loop of array
        dealership.search("Dodge",2000);

        System.out.println(dealership);

    }
}
