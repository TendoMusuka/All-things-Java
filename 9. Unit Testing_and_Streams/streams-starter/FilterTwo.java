/**
 * Learning about Stream Pipelines */
import java.util.ArrayList;
import java.util.stream.Collectors;

public class FilterTwo {

    static ArrayList<Double> prices = new ArrayList<Double>();


    public static void main(String[] args) {
        prices.add(1.99);
        prices.add(4.99);
        prices.add(10.99);
        prices.add(15.99);

        ArrayList<Double> lowPrices = new ArrayList<Double>();

       lowPrices.addAll( prices.stream()
        .filter(price ->{
            return price<5;
        })
        .collect (Collectors.toList())); //collects what is filtered and returns it as a list 

        ArrayList <Double> withTax = new ArrayList<Double>();

        withTax.addAll(prices.stream()
         .map( (price) -> {
         return price*1.13;
          })
        .collect(Collectors.toList()));
        
        //filterLowPrices(lowPrices);
    }

    /**It is better to use filters instead */
    // public static void filterLowPrices(ArrayList<Double> lowPrices) {
    //     for (int i = 0; i < prices.size(); i++) {
    //         if (prices.get(i) < 5) {
    //             lowPrices.add(prices.get(i));
    //         }
    //     }
    //}

}
