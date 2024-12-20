package AssignmentLast;

public class ArrayIndexOutOfBoundsExceptionExample {

    public static void main(String[] args) {
        try {
            // Attempt to access an array index that is out of bounds
            // This will throw an ArrayIndexOutOfBoundsException
            int[] array = new int[5];
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the ArrayIndexOutOfBoundsException by printing an error message
            System.out.println("Array index out of bounds: " + e.getMessage());
        } finally {
            // Finally block to perform cleanup actions, if necessary
            System.out.println("Finally block executed.");
        }
    }
}



/* ArrayIndexOutOfBoundsException is thrown to indicate
 that an array has been accessed with an illegal index.

Explanation: This code tries to access an index outside the bounds of the array,
 leading to an ArrayIndexOutOfBoundsException. */