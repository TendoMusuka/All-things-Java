import java.util.Objects;

public class Person {
  
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person source) {
        this.name = source.name;
        this.age = source.age;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Person)) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(name, person.name) && age == person.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age); //note the difference between Objects and object
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            "}";
    }

    // @Override //leave this override incase you misspell what you are trying to override
    // public boolean equals(Object obj) {
    //     if(obj ==null){
    //     return false;
    //     }

    //     if (!(obj instanceof Person)){
    //         return false ;
    //     }

        
    //     Person person = (Person)obj ;
    //     return this.age == person.getAge() && this.name.equals(person.getName());

    
    // }

    // public int getAge(){
    //     return age;
    // }

    // public String getName(){
    //     return name;
    // }

    // @Override
    // public int hashCode(){
    //     return Objects.hash(this.age, this.name);
    // }

    // @Override
    // public String toString() {
    
    //     return "Age: " + this.age + " Name: " + this.name; 
    // }
  
    

}
