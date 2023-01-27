package mypackage.app;

import mypackage.data.Product;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("sabun", 50.0);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
