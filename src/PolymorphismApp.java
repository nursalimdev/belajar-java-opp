public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Nursalim");
        employee.sayHello("Nursalim");

        employee = new Manager("Rani");
        employee.sayHello("Rani");

        employee = new VicePresident("Ana");
        employee.sayHello("Ana");

        sayHello(new Employee("Bagus"));
        sayHello(new VicePresident("Bondan"));
        sayHello(new Manager("Bli"));

    }

    static void sayHello(Employee employee){
//        System.out.println("Hello " + employee.name);
        if(employee instanceof VicePresident) {
            VicePresident vp = (VicePresident) employee;
            System.out.println("Hello VP " + vp.name);
        }else if(employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        }else {
            System.out.println("Hello Employee " + employee.name);
        }
    }
}
