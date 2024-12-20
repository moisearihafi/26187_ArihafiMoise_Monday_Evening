package AssignmentLast;

public class ClassCastExceptionExample {

        public static void main(String[] args) {
            try {
                // Attempt to cast an Integer object to a String
                // This will throw a ClassCastException
                int i = 0;
                Object obj = Integer.valueOf(i);
                String str = (String) obj;
            } catch (ClassCastException e) {
                // Handle the ClassCastException by printing an error message
                System.out.println("Class cast error: " + e.getMessage());
            } finally {
                // Finally block to perform cleanup actions, if necessary
                System.out.println("Finally block executed.");
            }
        }
    }

/*ClassCastException is thrown to indicate that the code has
 attempted to cast an object to a subclass of which it is not an instance.

 Explanation: This code attempts an invalid type cast, resulting in a ClassCastException.*/

