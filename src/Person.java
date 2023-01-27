class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    Person(String paramName){
        name = paramName;
    }

    Person(){

    }

    public void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", namaku " + name);
    }
}
