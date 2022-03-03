import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {

    static final String SALES = "data/sales.csv"; //Use backslash Windows users

    public static void main(String[] args) {
        
        try {
            Path path = Paths.get(Thread.currentThread().getContextClassLoader().getResource(SALES).toURI());
            //calculate average sales of "Furniture" here
            //calculate average sales of "Technology" here
            //calculate average sales of "Office Supplies" here
            //calculate total average of sales here

        } catch (URISyntaxException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Function name: average
     * @param path (Path)
     * @param category (String)
     * @return Double
     * 
     * Inside the function:
     *   1. Runs through every line from the CSV file as a stream.
     *   2. Maps every element in the stream to an array of three String values.
     *   3. Filters every value by the @param category
     *   4. Maps every element in the stream to a double (price * quantity).
     *   5. Applies the terminal operation average.
     *   6. Returns the average as double.
     * 
     */

     public static double average (Path path ,String category){
         try{
            return Files.lines(path) //running through every line as a streaam 
            .skip(1) //skips the first row since it is just column headings 
            .map((line)-> line.split(",")) //maps every element in the stream to an array of three string values
            .filter((values)-> values[0].equals(category)) //filter by category 
            .mapToDouble((values)->Double.valueOf(values[1])*Double.valueOf(values[2])) //maps every element to a double 
            .average().getAsDouble();//terminal operation 
         }
         catch (IOException e){
            System.out.println(e.getMessage());
         }
         return 0.0;
     }



    /**
     * Function name: totalAverage
     * @param path (Path)
     * @return Double
     * 
     * Inside the function:
     *   1. Runs through every line from the CSV file as a stream.
     *   2. Maps every element in the stream to an array of three values.
     *   3. Maps every element in the stream to a double: (price * quantity).
     *   4. Applies the terminal operation average.
     *   5. Returns the average as double.
     */
  

}
