package mypackage.data;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    //    public boolean equals(Object obj) {
//        if(obj == this) return true;
//
//        if(!(obj instanceof Product)) return false;
//
//        Product product = (Product) obj;
//        if(this.price != product.price) {
//            return false;
//        }
//
//        if(this.name != null ){
//            return this.name.equals(product.name)
//        }else {
//            return product.name == null;
//        }
//    }
}
