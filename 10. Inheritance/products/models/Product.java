package models;

public abstract class Product { //should not be able to create an object of a class whose purpose is inheritance
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

    

}
