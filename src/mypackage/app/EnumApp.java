package mypackage.app;

import mypackage.data.Customer;
import mypackage.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Nursalim");
        customer.setLevel(Level.STANDARD);
        System.out.println(customer.getLevel().getDescription());

        // konversi enum ke string
        String levelName = Level.VIP.name();
        System.out.println(levelName);

        // konversi string ke enum
        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        Level[] values = Level.values();
        for(var value : values){
            System.out.println(value);
        }

    }
}
