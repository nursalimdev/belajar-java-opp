package mypackage.app;

public class StackTraceApp {
    public static void main(String[] args) {
//        try {
//            String[] names = {"Nursalim", "Al Farizi"};
//            System.out.println(names[10]);
//        }catch (Throwable throwable){
//            StackTraceElement[] stackTrace = throwable.getStackTrace();
//
//            throwable.printStackTrace();
//        }

        try {
            sampleError();
        }catch (RuntimeException e){
            e.printStackTrace();
        }

    }

    public static void sampleError(){
        try {
            String[] names = {"Nursalim", "Al Farizi"};
            System.out.println(names[10]);
        }catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

}
