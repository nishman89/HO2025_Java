package com.sparta.jdbc;
import java.sql.*;

public class NorthwindClient {

    public static void main(String[] args) {
        try {

            // All details from MySqlConfig
            String connectionString = MySqlConfig.getProperty("dburl");
            String username = MySqlConfig.getProperty("dbuserid");
            String password = MySqlConfig.getProperty("dbpassword");
            // Connection to my database using all the config proeprties
            // Connection implemeents Autoclosable - so when the variable conns leave the try block scope - it closes the connection to the database
            try (Connection conn = DriverManager.getConnection(connectionString, username, password)) {
                delete(conn);
                read(conn);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    public static void read(Connection conn) throws SQLException {
        String query = "SELECT * FROM Customers;";

        // stm is used to excute the above query in Java code
        Statement stmt = conn.createStatement();
        // stores the result in the Result Set
        ResultSet rs = stmt.executeQuery(query);
        // Looping through the table with the while loop
        // Each time there is something to be returned .next() returns true
        while (rs.next()) {
            System.out.println(
                    rs.getString("CustomerID")
                            + " - " + rs.getString("ContactName") +
                            " - " + rs.getString("City") +
                            " - " + rs.getString("CompanyName")
            );
        }
    }

    private static void create(Connection conn) throws SQLException {
        String sql = "INSERT INTO Customers (CustomerID, ContactName, CompanyName, City) " +
                "VALUES ('MANDA', 'Nish Mandal', 'Sparta Global', 'Birmingham');";
        Statement stmt = conn.createStatement();
        // use stmt to excute the sql string
        // excuteUpdate returns the number of rows in the table that have been created!
        int affected = stmt.executeUpdate(sql);
        System.out.println("Rows affected: " + affected);
    }

    private static void update(Connection conn) throws Exception {
        String sql = "UPDATE Customers SET City = 'Berlin' WHERE CustomerID = 'MANDA';";
        try (Statement stmt = conn.createStatement()) {
            int affected = stmt.executeUpdate(sql);
            System.out.println("Rows affected: " + affected);
        }
    }
    private static void delete(Connection conn) throws SQLException {
        String sql = "DELETE FROM Customers WHERE CustomerID = 'MANDA';";
        Statement stmt = conn.createStatement() ;
        int affected = stmt.executeUpdate(sql);
        System.out.println("Rows affected: " + affected);
    }
}
