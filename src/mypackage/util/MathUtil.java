package mypackage.util;

public class MathUtil {
    public static int sum(int... values){
        int result = 0;
        for(int value : values){
            result += value;
        }

        return result;
    }
}
