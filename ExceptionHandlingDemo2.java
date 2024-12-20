package AssignmentLast;


    import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

    public class ExceptionHandlingDemo2 {
        // Summary of Exception Handling Approach
        // This program demonstrates various exception types in Java
        // Each method simulates a specific exception scenario
        // Proper try-catch blocks are used to handle and manage exceptions
        // Comments explain the purpose and mechanism of exception handling

        public static void main(String[] args) {
            try {
                // Demonstrate different exception scenarios
                demonstrateIOException();
                demonstrateFileNotFoundException();
                demonstrateEOFException();
                demonstrateSQLException();
                demonstrateClassNotFoundException();

                demonstrateArithmeticException();
                demonstrateNullPointerException();
                demonstrateArrayIndexOutOfBoundsException();
                demonstrateClassCastException();
                demonstrateIllegalArgumentException();
                demonstrateNumberFormatException();
            } catch (Exception e) {
                System.out.println("Global exception handler: " + e.getMessage());
            }
        }

        // Checked Exceptions

        // 1. IOException: Simulating file read error
        public static void demonstrateIOException() {
            try {
                // Attempt to read from a stream that might cause I/O issues
                FileInputStream fis = new FileInputStream("nonexistent.txt");
                int data;
                while ((data = fis.read()) != -1) {
                    System.out.print((char) data);
                }
                fis.close();
            } catch (IOException e) {
                System.out.println("IOException occurred: " + e.getMessage());
                System.out.println("Unable to read the file due to I/O error.");
            }
        }

        // 2. FileNotFoundException: Trying to open a non-existent file
        public static void demonstrateFileNotFoundException() {
            try {
                // Deliberately attempt to open a file that doesn't exist
                File file = new File("ghost_file.txt");
                FileReader fr = new FileReader(file);
                fr.close();
            } catch (FileNotFoundException e) {
                System.out.println("FileNotFoundException: " + e.getMessage());
                System.out.println("The specified file could not be found.");
            } catch (IOException e) {
                System.out.println("Unexpected IO error: " + e.getMessage());
            }
        }

        // 3. EOFException: Reaching end of file unexpectedly
        public static void demonstrateEOFException() {
            try {
                // Simulate reading beyond file content
                FileInputStream fis = new FileInputStream("sample.txt");
                DataInputStream dis = new DataInputStream(fis);

                // This would typically happen when trying to read past file end
                while (true) {
                    System.out.println(dis.readUTF());
                }
            } catch (EOFException e) {
                System.out.println("EOFException: Reached end of file.");
            } catch (IOException e) {
                System.out.println("IOException occurred: " + e.getMessage());
            }
        }

        // 4. SQLException: Database connection error
        public static void demonstrateSQLException() {
            try {
                // Simulate invalid database connection
                Connection conn = DriverManager.getConnection("invalid_connection_string");
            } catch (SQLException e) {
                System.out.println("SQLException: " + e.getMessage());
                System.out.println("Database connection or query error.");
            }
        }

        // 5. ClassNotFoundException: Missing class at runtime
        public static void demonstrateClassNotFoundException() {
            try {
                // Attempt to load a non-existent class
                Class.forName("com.nonexistent.Class");
            } catch (ClassNotFoundException e) {
                System.out.println("ClassNotFoundException: " + e.getMessage());
                System.out.println("The specified class could not be found.");
            }
        }

        // Unchecked Exceptions

        // 6. ArithmeticException: Division by zero
        public static void demonstrateArithmeticException() {
            try {
                // Deliberate division by zero
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException: " + e.getMessage());
                System.out.println("Cannot divide by zero.");
            }
        }

        // 7. NullPointerException: Accessing null reference
        public static void demonstrateNullPointerException() {
            try {
                // Attempt to call method on null object
                String nullString = null;
                System.out.println(nullString.length());
            } catch (NullPointerException e) {
                System.out.println("NullPointerException: " + e.getMessage());
                System.out.println("Attempted to use a null reference.");
            }
        }

        // 8. ArrayIndexOutOfBoundsException: Invalid array access
        public static void demonstrateArrayIndexOutOfBoundsException() {
            try {
                // Access an array index that doesn't exist
                int[] numbers = {1, 2, 3};
                System.out.println(numbers[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
                System.out.println("Tried to access an invalid array index.");
            }
        }

        // 9. ClassCastException: Invalid type casting
        public static void demonstrateClassCastException() {
            try {
                // Attempt an invalid type cast
                Object obj = "String";
                Integer num = (Integer) obj;
            } catch (ClassCastException e) {
                System.out.println("ClassCastException: " + e.getMessage());
                System.out.println("Cannot cast object to incompatible type.");
            }
        }

        // 10. IllegalArgumentException: Invalid method argument
        public static void demonstrateIllegalArgumentException() {
            try {
                // Method that checks for valid input
                processAge(-5);
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException: " + e.getMessage());
                System.out.println("Invalid argument provided.");
            }
        }

        // Helper method for IllegalArgumentException
        private static void processAge(int age) {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
            System.out.println("Age is valid: " + age);
        }

        // 11. NumberFormatException: Invalid number conversion
        public static void demonstrateNumberFormatException() {
            try {
                // Attempt to parse an invalid number string
                int number = Integer.parseInt("not a number");
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: " + e.getMessage());
                System.out.println("Cannot convert string to number.");
            }
        }
    }

