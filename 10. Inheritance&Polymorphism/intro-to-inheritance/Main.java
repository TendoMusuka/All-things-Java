public class Main {
    public static void main(String[] args) {

    Person person = new Person ("Zack",  27);
    //person can access different methods even though you have not defined some of the 
    //methods    
    Person person2 = new Person (person); //person 2 and person DO NOT  share the same reference as person 2 is a copy of personjava

    System.out.println(person2==person); //comparing references -never use the double equal sign to compare objects 
    System.out.println(person2.equals(person)); //comparing references if you do not override the initial equals method

    //If you do not override the equals function it only returns true if the references are equal

    Person person3 = person; //this method copies the reference
    System.out.println(person.hashCode());
    System.out.println(person.hashCode());

    Object person5 = new Person(person); //still using the Person to 


    System.out.println(person.toString()); //need to override it ,otherwise would print Person@2a68f5
    System.out.println(person); //do not need to calll the toString method as Java is smart enough to call it
        
    } 
}
