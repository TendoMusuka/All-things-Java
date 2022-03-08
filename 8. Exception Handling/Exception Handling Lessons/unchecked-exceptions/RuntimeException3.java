import java.util.Scanner;
public class RuntimeException3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        while(true){
                if (scan.hasNextLine()){
                    System.out.println(scan.nextInt());
                    break;
                } else {
                    scan.nextLine();
                    System.out.println("not a number");
                }
                scan.close();
    
        }
    }
}
