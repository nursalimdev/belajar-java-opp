package mypackage.app;

import mypackage.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("admin", null);
    }

    private static void connectDatabase(String username, String password) {
        if(username == null || password == null){
            throw new DatabaseError("Tidak bisa koneksi ke database");
        }
    }
}
