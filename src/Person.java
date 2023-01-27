class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    Person(String name){
        this(name, null);
    }

    Person(){
        this(null);
    }

    public void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", namaku " + name);
    }
}
