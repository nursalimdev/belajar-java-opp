package mypackage.app;

import mypackage.data.Avanza;
import mypackage.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTier());
        car.drive();
    }
}
