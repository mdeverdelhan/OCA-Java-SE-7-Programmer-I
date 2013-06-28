package eu.verdelhan.ocajexam.chapter4.ex4_1;

public class Main {

    public static void main(String[] args) {

        // Creating the car
        Car yourCar = new Car(230, true);

        // Accessing to Car object's fields
        System.out.println("Is the car running? " + yourCar.isRunning());
        System.out.println("Car's top speed: " + yourCar.getTopSpeed());
    }
}