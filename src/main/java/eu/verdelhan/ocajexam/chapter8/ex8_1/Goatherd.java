package eu.verdelhan.ocajexam.chapter8.ex8_1;

public class Goatherd implements Describable {

    private String description;

    public Goatherd(String name, int age) {
        description = "A " + age + "-years-old goatherd named " + name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void feedGoats() {
        System.out.println("The goatherd is feeding its goats.");
    }
}