package mypackage.data;

public class Product {
    public String name;
    public Double price;

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Product name : " + name + ", price " + price;
    }
}
