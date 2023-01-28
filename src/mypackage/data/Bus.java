package mypackage.data;

public class Bus implements Car{

    public void drive() {
        System.out.println("Bus Drive");
    }

    public int getTier() {
        return 4;
    }

    public String getBrand() {
        return "Hino";
    }

    public boolean isMaintenance() {
        return false;
    }

    public boolean isBig() {
        return true;
    }
}
