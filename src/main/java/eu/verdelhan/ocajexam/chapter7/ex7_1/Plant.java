package eu.verdelhan.ocajexam.chapter7.ex7_1;

/**
 * A Plant class.
 */
public abstract class Plant {

    private int age = 0;
    private int height = 0;

    public int getAge() {
        return age;
    }

    public void addYearToAge() {
        age++;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    abstract public void doSpring();
    abstract public void doSummer();
    abstract public void doFall();
    abstract public void doWinter();
}
