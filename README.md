# 26187_ArihafiMoise_Monday_Evening
## Exceptions Assignment

package AssignmentLast;

public class ArithmeticExceptionExample {

        public static void main(String[] args) {
            try {
                // Attempt to divide by zero
                // This will throw an ArithmeticException
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                // Handle the ArithmeticException by printing an error message
                System.out.println("Arithmetic error: " + e.getMessage());
            } finally {
                // Finally block to perform cleanup actions, if necessary
                System.out.println("Finally block executed.");
            }
        }
    }


/*ArithmeticException is thrown when an exceptional arithmetic condition has
occurred. For example, division by zero.


