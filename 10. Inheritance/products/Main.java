import models.Discountable;
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

        Pants pants = new Pants (32,24.99,"blue", "Tendo");
        Pants pants2 = new Pants(pants);

        Pants pants3 = new Pants(34,104.99,"red", "Jangular");
        System.out.println(pants3.compareTo(pants)); //pants 3 has a higher price so this returns a positive number 
        pants.discount(); //use the debugger to go through and see the results 
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
