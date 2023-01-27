class ManagerApp {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.name = "Nursalim";
        manager.sayHello("Infrastructure Manager");

        VicePresident vicePresident = new VicePresident();
        vicePresident.name = "Ana Fauziah";
        vicePresident.sayHello("VP Technology");
    }
}
