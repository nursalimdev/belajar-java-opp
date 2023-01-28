package mypackage.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("README.md"));
            while (true) {
                String line = br.readLine();
                if(line == null){
                    break;
                }
                System.out.println(line);
            }
        }catch (Throwable throwable){
            System.out.println("Error membaca file " + throwable.getMessage());
        }finally {
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Error menutup recource " + e.getMessage());
                }
            }
        }
    }
}
