package mypackage.data;

public record LoginRequest(String username, String password) {

    // constructor record
    public LoginRequest{
        System.out.println("Membuat object login request");
    }

    public LoginRequest(String username){
        this(username, "");
    }

    public LoginRequest(){
        this("", "");
    }
}
