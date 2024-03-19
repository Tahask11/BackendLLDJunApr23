package DesignPatterns.Singleton;

import java.util.List;

/*
 *
 *  FINAL SOLUTION
 * */
public class DatabaseConnection3 {
    private static DatabaseConnection3 dbConn = null;
    String url;
    String DBname;
    String Password;
    List<Integer> pools;

    private DatabaseConnection3() {

    }

    public static DatabaseConnection3 getInstance() {
        //Double check locking
        if (dbConn == null) {
            synchronized (DatabaseConnection3.class) {
                if (dbConn == null) {
                    dbConn = new DatabaseConnection3();
                }
            }
        }
        return dbConn;
    }
}
