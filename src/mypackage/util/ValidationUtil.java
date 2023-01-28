package mypackage.util;

import mypackage.annotation.NotBlank;
import mypackage.data.Login;
import mypackage.error.BlankException;
import mypackage.error.ValidationException;

import java.lang.reflect.Field;

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

    public static void validateReflection(Object object) {
        Field[] fields = object.getClass().getDeclaredFields();
        for(var field: fields){
            field.setAccessible(true);

            if(field.getAnnotation(NotBlank.class) != null){
                // validate
                try{
                    String value = (String) field.get(object);

                    if(value == null || value.isBlank()) {
                        throw new BlankException("Field " + field.getName() + " is blank ");
                    }
                }catch(IllegalAccessException e) {
                    System.out.println("Tidak bisa mengakses field " + field.getName());
//                    e.printStackTrace();
                }

            }
        }

    }
}
