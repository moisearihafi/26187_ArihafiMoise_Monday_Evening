package AssignmentLast;


 import java.io.*;

    public class EOFExceptionExample {
        public static void main(String[] args) {
            try {
                // Attempt to read beyond the end of the file
                // This will eventually throw an EOFException
                DataInputStream input = new DataInputStream(new FileInputStream("test.txt"));
                while (true) {
                    // Reading beyond file content
                    System.out.println(input.readUTF());
                }
            } catch (EOFException e) {
                // Handle the EOFException by printing an error message
                System.out.println("End of file reached: " + e.getMessage());
            } catch (IOException e) {
                // Handle other IOExceptions by printing an error message
                System.out.println("An IOException occurred: " + e.getMessage());
            } finally {
                // Finally block to perform cleanup actions, if necessary
                System.out.println("Finally block executed.");
            }
        }
    }


/* An EOFException is thrown when an end of file or
 end of stream has been reached unexpectedly during input.

Explanation: This code continuously reads from a file until
it unexpectedly reaches the end, causing an EOFException.*/


