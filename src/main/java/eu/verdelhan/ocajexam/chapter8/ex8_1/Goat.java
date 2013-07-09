package eu.verdelhan.ocajexam.chapter8.ex8_1;

public class Goat implements Describable {

    private String description;

    public Goat(String name) {
        description = "A goat named " + name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    /*
     * Implement other methods for a goat
     */

    public void eat() {
        System.out.println("The goat is eating grass.");
    }

    public void sleep() {
        System.out.println("The goat is sleeping.");
    }
}