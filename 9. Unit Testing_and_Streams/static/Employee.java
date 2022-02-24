public class Employee {
    private String name;
    private String position;
    private static int hiredCount;  //belong to class and not object 
    //

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
        hiredCount++;

    }
  
    public Employee(Employee source) {
        this.name = source.name;
        this.position = source.position;
    }

    public String getName() {
        return name;
    }
    
    public String getPosition() {
        return position;
    }
  
    public void greet(String company) {
        if (company.equals("JAVASTARS")) {
            System.out.println("Welcome!");
        }
    }

    public static int getHiredCount(){
        return hiredCount;
    }

    public String toString() {

        return "\tName: " + name + "\tPosition: " + this.position + "\tCompany: " + "JAVASTARS" + "\n";
    }
}
