package Employeee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {
    /* Two interfaces as below */
    public Connection c; // sets up connection with MySQL
    public Statement s; // Used to run SQL queries from java code
    /* conn() constructor to register MySQL drivers */

    public conn() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); // Registering MySQL drivers
            c = DriverManager.getConnection("jdbc:mysql:///projects", "root", "");
            // Setting up connection using connection interface
            /*
             * jdbc:mysql (Type of DB):///project3 (DB name)", "root (Root user", "" (Empty
             * password)
             */
            s = c.createStatement(); // Statement requires connection hence we are using same connection as we
                                     // defined above to run SQL queries
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
