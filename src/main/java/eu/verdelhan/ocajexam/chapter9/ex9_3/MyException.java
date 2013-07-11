package eu.verdelhan.ocajexam.chapter9.ex9_3;

/**
 * My exception type.
 */
public class MyException extends Exception {

    private static final long serialVersionUID = 1L;

    public MyException() {
        super();
    }

    public MyException(String s) {
        super(s);
    }
}