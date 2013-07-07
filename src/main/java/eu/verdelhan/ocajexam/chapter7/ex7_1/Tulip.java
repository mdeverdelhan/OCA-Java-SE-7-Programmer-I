package eu.verdelhan.ocajexam.chapter7.ex7_1;

public class Tulip extends Plant {

    private static final int AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON = 1;

    /*
     * A tulip grows each year to the same height. During the winter they die
     * down to ground level.
     */
    private void grow() {
        int currentHeight = getHeight();
        setHeight(currentHeight + AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON);
    }

    private void dieDownForWinter() {
        setHeight(0);
    }

    @Override
    public void doSpring() {
        grow();
        addYearToAge();
        System.out.println("Spring: The tulip is starting to grow up from the ground");
        System.out.println("\tCurrent Age: " + getAge() + " Current Height: " + getHeight());
    }

    @Override
    public void doSummer() {
        System.out.println("Summer: The tulip has stopped growing and is flowering");
        System.out.println("\tCurrent Age: " + getAge() + " Current Height: " + getHeight());
    }

    @Override
    public void doFall() {
        System.out.println("Fall: The tulip begins to wilt");
        System.out.println("\tCurrent Age: " + getAge() + " Current Height: " + getHeight());
    }

    @Override
    public void doWinter() {
        dieDownForWinter();
        System.out.println("Winter: The tulip is dormant undergound");
        System.out.println("\tCurrent Age: " + getAge() + " Current Height: " + getHeight());
    }
}