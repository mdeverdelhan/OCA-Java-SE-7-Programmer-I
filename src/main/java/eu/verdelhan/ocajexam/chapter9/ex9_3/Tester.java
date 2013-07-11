package eu.verdelhan.ocajexam.chapter9.ex9_3;

public class Tester {

    public static void main(String[] args) {

        Tester t = new Tester();

        try {
            t.tryToThrowAnException("test");
        } catch (MyException e) {
            System.out.println("Never caught.");
        }

        try {
            t.tryToThrowAnException("l33t");
        } catch (MyException e) {
            System.out.println("Exception caught. Here's the message: " + e.getMessage());
        }
    }

    /**
     * Throws an exception if the string equals "l33t".
     * @param aString the string
     * @throws MyException if the string equals "l33t"
     */
    private void tryToThrowAnException(String aString) throws MyException {
        if ("l33t".equals(aString)) {
            throw new MyException("Hey! You found a l33t!");
        }
    }
}