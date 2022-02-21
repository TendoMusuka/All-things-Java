import models.Pants;
import models.Shirt;

public class Main {
  
    static final String FILE_NAME = "products.txt";

    public static void main(String[] args) {

        Shirt shirt = new Shirt (Shirt.Size.SMALL, 5.99, "blue", "red"); 
        Shirt shirt2 = new Shirt(shirt);
    
        System.out.println(shirt2);

        System.out.println(shirt.getPrice()); //gets it from Parent class Product
    
        //test if shirt actually extends from product and put a breakpoint and see if all necessary fields are created
        shirt.equals(shirt2);
    }
  
    /**
     * Function Name: getData
     * @return Product[]
     * @throws FileNotFoundException
     * 
     * Inside the function:
     *   1. Loads the data from products.txt
     */
}
