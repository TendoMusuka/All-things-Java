import java.util.ArrayList;

public class ResizableArrays {
    public static void main(String[] args) {
        ArrayList<String> names = NewArrayList<String>(); //Arraylist is an object so it has many elements that can add or remove an item

        names.add("Joe");
        names.add("Jim");
        names.add("John");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names.get(i));
        } 
        
    }
}
