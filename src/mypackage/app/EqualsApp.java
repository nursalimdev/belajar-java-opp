package mypackage.app;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Nursalim";
        first += " Al Farizi";

        System.out.println(first);

        String second = "Nursalim Al Farizi";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Nursalim Al Farizi";
        System.out.println(second == third);
    }
}
