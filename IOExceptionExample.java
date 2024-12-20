package AssignmentLast;


    import java.io.*;

    public class IOExceptionExample {
        public static void main(String[] args) {
            try {
                // Attempt to read from a file that doesn't exist
                // This will throw a FileNotFoundException, which is a subclass of IOException
                BufferedReader reader = new BufferedReader(new FileReader("non_existent_file.txt"));
                reader.readLine();
            } catch (IOException e) {
                // Handle the IOException by printing an error message
                System.out.println("An IOException occurred: " + e.getMessage());
            } finally {
                // Finally block to perform cleanup actions, if necessary
                System.out.println("Finally block executed.");
            }
        }
    }


/* An IOException signals that an I/O operation has failed or been interrupted.
It's a common superclass for many other I/O-related exceptions.
 */
// Explanation: This code tries to read from a non-existent file, triggering an IOException.

