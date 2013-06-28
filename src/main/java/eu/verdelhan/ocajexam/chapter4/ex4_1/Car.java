package eu.verdelhan.ocajexam.chapter4.ex4_1;

public class Car {

    private int topSpeed;
    private boolean running;

    Car(int topSpeed, boolean running) {
        this.running = running;
        this.topSpeed = topSpeed;
    }

    public boolean isRunning() {
        return running;
    }

    public int getTopSpeed() {
        return topSpeed;
    }
}