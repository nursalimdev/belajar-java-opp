package mypackage.app;

import mypackage.data.Login;
import mypackage.error.ValidationException;
import mypackage.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        Login login = new Login(null, "password");
        try {
            ValidationUtil.validate(login);
            System.out.println("Data valida");
        } catch (ValidationException | NullPointerException e) {
            System.out.println("Data tidak valid : " +e.getMessage());
        } finally {
            System.out.println("Error gak error tetap santuy..");
        }
//        catch (NullPointerException e){
//            System.out.println("Ada null pointer : " +e.getMessage());
//        }
    }
}
