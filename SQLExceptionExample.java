package AssignmentLast;


    import java.sql.*;

    public class SQLExceptionExample {
        public static void main(String[] args) {
            try {
                // Attempt to connect to an invalid database URL
                // This will throw a SQLException
                Connection connection = DriverManager.getConnection("jdbc:invalid_url");
            } catch (SQLException e) {
                // Handle the SQLException by printing an error message
                System.out.println("A SQL error occurred: " + e.getMessage());
            } finally {
                // Finally block to perform cleanup actions, if necessary
                System.out.println("Finally block executed.");
            }
        }
    }


/*SQLException is thrown when there is
 any issue with the database access or other database errors.

Explanation: This code attempts to connect
to an invalid database URL, resulting in a SQLException.*/

