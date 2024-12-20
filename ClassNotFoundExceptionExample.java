package AssignmentLast;

public class ClassNotFoundExceptionExample {

        public static void main(String[] args) {
            try {
                // Attempt to load a class that doesn't exist
                // This will throw a ClassNotFoundException
                Class.forName("com.example.NonExistentClass");
            } catch (ClassNotFoundException e) {
                // Handle the ClassNotFoundException by printing an error message
                System.out.println("Class not found: " + e.getMessage());
            } finally {
                // Finally block to perform cleanup actions, if necessary
                System.out.println("Finally block executed.");
            }
        }
    }


/* ClassNotFoundException is thrown when an application tries to load a class through its string name,
 but no definition for the class with the specified name could be found.

Explanation: This code tries to load a class that does not exist, triggering a ClassNotFoundException*/

