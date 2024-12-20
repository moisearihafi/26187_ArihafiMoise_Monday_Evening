package AssignmentLast;


    // Summary: This program demonstrates handling of various exceptions in Java.
// Each method simulates a specific exception and provides a handling mechanism.

import java.io.*;
import java.sql.*;

    public class ExceptionHandlingDemo {

        // 1. IOException: Attempting to read a non-existent file
        public static void handleIOException() {
            try {
                BufferedReader reader = new BufferedReader(new FileReader("nonexistentfile.txt"));
                System.out.println(reader.readLine());
                reader.close();
            } catch (IOException e) {
                System.out.println("IOException caught: " + e.getMessage());
            }
        }

        // 2. FileNotFoundException: Specific case of IOException
        public static void handleFileNotFoundException() {
            try {
                FileInputStream file = new FileInputStream("missingfile.txt");
            } catch (FileNotFoundException e) {
                System.out.println("FileNotFoundException caught: " + e.getMessage());
            }
        }

        // 3. EOFException: Reading beyond the end of a file
        public static void handleEOFException() {
            try {
                DataInputStream input = new DataInputStream(new FileInputStream("example.txt"));
                while (true) {
                    System.out.println(input.readUTF());
                }
            } catch (EOFException e) {
                System.out.println("EOFException caught: End of file reached.");
            } catch (IOException e) {
                System.out.println("IOException caught: " + e.getMessage());
            }
        }

        // 4. SQLException: Database connection issue
        public static void handleSQLException() {
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nonexistentdb", "user", "password");
            } catch (SQLException e) {
                System.out.println("SQLException caught: " + e.getMessage());
            }
        }

        // 5. ClassNotFoundException: Missing class at runtime
        public static void handleClassNotFoundException() {
            try {
                Class.forName("com.example.NonExistentClass");
            } catch (ClassNotFoundException e) {
                System.out.println("ClassNotFoundException caught: " + e.getMessage());
            }
        }

        // 6. ArithmeticException: Division by zero
        public static void handleArithmeticException() {
            try {
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught: " + e.getMessage());
            }
        }

        // 7. NullPointerException: Accessing null reference
        public static void handleNullPointerException() {
            try {
                String str = null;
                System.out.println(str.length());
            } catch (NullPointerException e) {
                System.out.println("NullPointerException caught: " + e.getMessage());
            }
        }

        // 8. ArrayIndexOutOfBoundsException: Invalid array index
        public static void handleArrayIndexOutOfBoundsException() {
            try {
                int[] array = {1, 2, 3};
                System.out.println(array[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
            }
        }

        // 9. ClassCastException: Invalid type casting
        public static void handleClassCastException() {
            try {
                Object obj = Integer.valueOf(10); // Proper way to create an Integer object
                String str = (String) obj;       // This causes the ClassCastException
            } catch (ClassCastException e) {
                System.out.println("ClassCastException caught: " + e.getMessage());
            }
        }


        // 10. IllegalArgumentException: Invalid argument to a method
        public static void handleIllegalArgumentException() {
            try {
                Thread.sleep(-1000); // Negative sleep duration
            } catch (IllegalArgumentException | InterruptedException e) {
                System.out.println("IllegalArgumentException caught: " + e.getMessage());
            }
        }

        // 11. NumberFormatException: Invalid number format
        public static void handleNumberFormatException() {
            try {
                int number = Integer.parseInt("notanumber");
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException caught: " + e.getMessage());
            }
        }

        // Main method to execute all exception handlers
        public static void main(String[] args) {
            handleIOException();
            handleFileNotFoundException();
            handleEOFException();
            handleSQLException();
            handleClassNotFoundException();
            handleArithmeticException();
            handleNullPointerException();
            handleArrayIndexOutOfBoundsException();
            handleClassCastException();
            handleIllegalArgumentException();
            handleNumberFormatException();
        }
    }

