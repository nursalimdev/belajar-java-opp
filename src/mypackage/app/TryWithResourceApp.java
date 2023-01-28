package mypackage.app;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResourceApp {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("README.md"))){
            while (true){
                String line = br.readLine();

                if(line == null){
                    break;
                }

                System.out.println(line);
            }
        }catch (Throwable throwable){
            System.out.println("Terjadi error baca file " + throwable.getMessage());
            throwable.printStackTrace();
        }
    }
}
