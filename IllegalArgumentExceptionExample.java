package AssignmentLast;

    public class IllegalArgumentExceptionExample {
        public static void main(String[] args) {
            try {
                // Attempt to set an invalid thread priority
                // This will throw an IllegalArgumentException
                Thread thread = new Thread();
                thread.setPriority(20); // Invalid priority
            } catch (IllegalArgumentException e) {
                // Handle the IllegalArgumentException by printing an error message
                System.out.println("Illegal argument: " + e.getMessage());
            } finally {
                // Finally block to perform cleanup actions, if necessary
                System.out.println("Finally block executed.");
            }
        }
    }


/* IllegalArgumentException is thrown to indicate that
 a method has been passed an illegal or inappropriate argument.

 Explanation: This code sets an invalid thread priority, causing an IllegalArgumentException.*/


