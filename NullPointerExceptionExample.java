package AssignmentLast;


    public class NullPointerExceptionExample {
        public static void main(String[] args) {
            try {
                // Attempt to call a method on a null object
                // This will throw a NullPointerException
                String str = null;
                System.out.println(str.length());
            } catch (NullPointerException e) {
                // Handle the NullPointerException by printing an error message
                System.out.println("Null pointer error: " + e.getMessage());
            } finally {
                // Finally block to perform cleanup actions, if necessary
                System.out.println("Finally block executed.");
            }
        }
    }


/* NullPointerException is thrown when an application attempts
 to use null where an object is required.

Explanation: This code tries to access the length of a null string,
resulting in a NullPointerException.*/

