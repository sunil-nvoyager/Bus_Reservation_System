import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
    /**
     * Establishes a connection to the MySQL database.
     *
     * This method attempts to load the MySQL JDBC driver and establish a connection
     * to the database located at "jdbc:mysql://localhost/bus" using the username "root"
     * and an empty password. If successful, it returns a {@link Connection} object
     * representing the connection to the database.
     *
     * @return a {@link Connection} object if the connection is successfully established;
     *         otherwise, returns null if an exception occurs during the process.
     *
     * @throws ClassNotFoundException if the MySQL JDBC driver class is not found.
     * @throws SQLException if a database access error occurs or the URL is null.
     */
    public static Connection getDBConnection() {
        
        Connection connection;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/bus", "root", "");
            return connection;
        } catch (Exception ex) {
            return null;
        }//try catch closed
    }//getDBConnection() closed
}//class closed
