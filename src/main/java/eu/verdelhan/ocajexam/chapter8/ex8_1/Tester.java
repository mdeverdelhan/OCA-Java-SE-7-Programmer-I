package eu.verdelhan.ocajexam.chapter8.ex8_1;

public class Tester {

    public static void main(String[] args) {
        new Tester();
    }

    public Tester() {
        Goat goat = new Goat("Bob");
        GoatShelter goatShelter = new GoatShelter(4, 4, 6);
        Goatherd goatherd = new Goatherd("Timmy", 42);
        System.out.println(description(goat));
        System.out.println(description(goatShelter));
        System.out.println(description(goatherd));
    }

    private String description(Describable d) {
        return d.getDescription();
    }
}