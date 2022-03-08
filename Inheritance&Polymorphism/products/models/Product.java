package models;

public abstract class Product implements Comparable<Product> { //should not be able to create an object of a class whose purpose is inheritance
    //making it abstract stops you from being able to create an object
    private String color;
    private double price;
    private String brand;
    
    public Product (double price, String color , String brand){
        this.price = price;
        this.color = color;
        this.brand = brand;
    }

    public Product(Product source){
        this.price = source.price;
        this.color = source.color;
        this.brand = source.brand;
    }


    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Compare to :
        //If it is negative it means the current object is less than the specified object 
        //If thereryrn value is positive the current object > specified object 
    @Override

    //** Compare by type name and then sort it out by price  */
    public int compareTo(Product specifiedObject) { //compare to receives a specified object
        String className = this.getClass().getSimpleName(); //get the class type by using getClass and get the name using
        String sClassName= specifiedObject.getClass().getSimpleName();

        if(!(className.equals(sClassName))){
            return className.compareTo(sClassName);
        }
        return (int) Math.round(this.getPrice()-specifiedObject.getPrice());
        //Math round , rounds off t
    }


    @Override
    public String toString() {
        return "{" +
            " color='" + getColor() + "'" +
            ", price='" + getPrice() + "'" +
            ", brand='" + getBrand() + "'" +
            "}";
    }



    

}
