class VicePresident extends Manager{

    VicePresident(String name){
//        super(name); boleh salah satu
        super(name, null);
    }
    void sayHello(String name){
        System.out.println("Hello " + name + ", my name is VP " + this.name);
    }
}
