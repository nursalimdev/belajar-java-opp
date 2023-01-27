package mypackage.app;

import mypackage.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "ucing";
        System.out.println(cat.name);
        cat.run();
    }
}
