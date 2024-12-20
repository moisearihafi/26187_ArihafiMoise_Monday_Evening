package AssignmentLast;


    public class NumberFormatExceptionExample {
        public static void main(String[] args) {
            try {
                // Attempt to parse a string that is not a valid number
                // This will throw a NumberFormatException
                int num = Integer.parseInt("abc");
            } catch (NumberFormatException e) {
                // Handle the NumberFormatException by printing an error message
                System.out.println("Number format error: " + e.getMessage());
            } finally {
                // Finally block to perform cleanup actions, if necessary
                System.out.println("Finally block executed.");
            }
        }
    }


/* NumberFormatException is thrown to indicate that the application has attempted to convert
a string to a numeric type, but the string does not have the appropriate format.

Explanation: This code tries to convert a non-numeric string to an integer, resulting in a NumberFormatException.*/

