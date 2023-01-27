package mypackage.app;

import mypackage.data.City;
import mypackage.data.Location;

public class LocationApp {
    public static void main(String[] args) {
//        Location location = new Location(); // error
        City city = new City();
        city.name = "Jakarta";
        System.out.println(city.name);
    }
}
