package mypackage.app;

import mypackage.data.CreateUserRequest;
import mypackage.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("Nursalim");
        request.setPassword("password");
        ValidationUtil.validateReflection(request);
    }
}
