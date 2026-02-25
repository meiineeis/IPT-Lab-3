package sportsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {

    public static Connection connect() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db",
                    "root",
                    ""
            );

            System.out.println("Connected");

        } catch (SQLException e) {
            System.out.println(e);
        }

        return conn;
    }

}
