class ManagerApp {
    public static void main(String[] args) {
        Manager manager = new Manager("NUrsalim");
//        manager.name = "Nursalim";
        manager.sayHello("Infrastructure Manager");

        VicePresident vicePresident = new VicePresident("Ana Fauziah");
//        vicePresident.name = "Ana Fauziah";
        vicePresident.sayHello("VP Technology");

        System.out.println(manager);
        System.out.println(manager.toString());
        System.out.println(vicePresident);
        System.out.println(vicePresident.toString());
    }
}
