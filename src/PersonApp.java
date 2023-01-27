public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Nursalim", "Jakarta");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        person1.sayHello("Developer");

        Person person2 = new Person("Budi");

        Person person3;
        person3 = new Person();
        person3.name = "Ani";
        person3.address = "Medan";
        person3.sayHello("Developer");


    }
}
