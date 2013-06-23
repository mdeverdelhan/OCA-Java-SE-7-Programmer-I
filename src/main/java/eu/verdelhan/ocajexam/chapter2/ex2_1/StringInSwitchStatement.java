package eu.verdelhan.ocajexam.chapter2.ex2_1;

public class StringInSwitchStatement {

    public static void main(String[] args) {

        final String myString = "test";

        switch (myString) {
        case "42":
            System.out.println("Unmanaged string. But retry when you'll want answers about universe.");
            break;
        case "test":
            System.out.println("String found!");
            break;
        case "muhu":
        default:
            System.out.println("Unmanaged string");
            break;
        }
    }
}