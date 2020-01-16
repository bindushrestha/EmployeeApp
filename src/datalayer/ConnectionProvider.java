package datalayer;

import java.sql.*;

public class ConnectionProvider {
    public static Connection getConnection() throws  ClassNotFoundException, SQLException{

        Connection conn = null;
        try {
            // db parameters
            String url       = "jdbc:mysql://localhost:3306/employee_db";
            String user      = "root";
            String password  = "password";

            // create a connection to the database
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("in my provider  connection is :"+ conn);
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } finally {

        }
        return conn;
    }


}
