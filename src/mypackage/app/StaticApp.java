package mypackage.app;

import mypackage.data.Application;
import static mypackage.data.Constant.*;
import mypackage.data.Country;
import mypackage.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(MathUtil.sum(10, 20, 30, 40));

        Country.City city = new Country.City();
        city.setName("Jakarta");

        System.out.println(city.getName());

        System.out.println(Application.PROCESSORS);

    }
}
