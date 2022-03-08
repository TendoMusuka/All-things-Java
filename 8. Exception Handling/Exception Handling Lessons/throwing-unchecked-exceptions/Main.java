import models.*; //star grabs every file inside the folder

public class Main {
    public static void main(String[] args) {
        Employee stocker = new Employee("Tendo" , "Stocker");
        Employee assisManager = new Employee("Nicholas", "Assistance");
        Employee manager = new Employee("Denis", "Manager");

        Store store = new Store();
        store.setEmployees(0,stocker);
        store.setEmployees(1,assisManager);
        store.setEmployees(2,manager);

        System.out.println(store);
        store.open();
        
    }
}
