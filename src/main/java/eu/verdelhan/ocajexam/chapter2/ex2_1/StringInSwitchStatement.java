package eu.verdelhan.ocajexam.chapter2.ex2_1;

public class StringInSwitchStatement {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String myString = "test";

        switch (myString) {
        case "42":
            break;
        case "test":
            System.out.println("Case found!");
            break;
        default:
            System.out.println("Unmanaged string");
            break;
        }

    }
}
