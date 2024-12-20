package AssignmentLast;


    import java.io.*;

    public class FileNotFoundExceptionExample {
        public static void main(String[] args) {
            try {
                // Attempt to open a file that doesn't exist
                // This will throw a FileNotFoundException
                FileInputStream file = new FileInputStream("non_existent_file.txt");
            } catch (FileNotFoundException e) {
                // Handle the FileNotFoundException by printing an error message
                System.out.println("File not found: " + e.getMessage());
            } finally {
                // Finally block to perform cleanup actions, if necessary
                System.out.println("Finally block executed.");
            }
        }
    }


/* FileNotFoundException is a specific type of IOException that occurs when an attempt to
 open a file denoted by a specified pathname has failed.

 Explanation: This code attempts to open a non-existent file,
  leading to a FileNotFoundException.*/

