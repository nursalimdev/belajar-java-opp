package mypackage.util;

import mypackage.data.Login;
import mypackage.error.BlankException;
import mypackage.error.ValidationException;

public class ValidationUtil {
    public static void validate(Login login) throws ValidationException, NullPointerException {
        if(login.getUsername() == null){
            throw new NullPointerException("Username tidak boleh null");
        }else if(login.getUsername().isBlank()){
            throw new ValidationException("Username tidak boleh blank");
        }else if(login.getPassword() != null){
            throw new NullPointerException("Password tidak boleh null");
        }else if(login.getPassword().isBlank()) {
            throw new ValidationException("Username tidak boleh blank");
        }
    }
    public static void validateRuntime(Login login) {
        if(login.getUsername() == null){
            throw new NullPointerException("Username tidak boleh null");
        }else if(login.getUsername().isBlank()){
            throw new BlankException("Username tidak boleh blank");
        }else if(login.getPassword() != null){
            throw new NullPointerException("Password tidak boleh null");
        }else if(login.getPassword().isBlank()) {
            throw new BlankException("Username tidak boleh blank");
        }
    }
}
