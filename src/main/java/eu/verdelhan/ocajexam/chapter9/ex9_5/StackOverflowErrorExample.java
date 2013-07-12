package eu.verdelhan.ocajexam.chapter9.ex9_5;

public class StackOverflowErrorExample {

    public static void main(String[] args) {
        try {
            new StackOverflowErrorExample().recursiveMethod();
        } catch (Throwable t) {
            System.out.println("Here is the throwable object: " + t);
        }
    }

    /**
     * A recursive method.
     */
    public void recursiveMethod() {
        // Creating a useful array of objects
        Object[] objectArray = new Object[1024];
        // Calling this method recursively
        new StackOverflowErrorExample().recursiveMethod();
    }
}