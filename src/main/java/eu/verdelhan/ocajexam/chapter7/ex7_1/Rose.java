package eu.verdelhan.ocajexam.chapter7.ex7_1;

public class Rose extends Plant {

    private static final int AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON = 2;

    private void grow() {
        int currentHeight = getHeight();
        setHeight(currentHeight + AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON);
    }

    @Override
    public void doSpring() {
        grow();
        addYearToAge();
        System.out.println("Spring: The rose is starting to grow leaves and new branches");
        System.out.println("\tCurrent Age: " + getAge() + " Current Height: " + getHeight());
    }

    @Override
    public void doSummer() {
        System.out.println("Summer: The rose has stopped growing and is flowering");
        System.out.println("\tCurrent Age: " + getAge() + " Current Height: " + getHeight());
    }

    @Override
    public void doFall() {
        System.out.println("Fall: The rose begins to wilt");
        System.out.println("\tCurrent Age: " + getAge() + " Current Height: " + getHeight());
    }

    @Override
    public void doWinter() {
        System.out.println("Winter: The rose must be protected");
        System.out.println("\tCurrent Age: " + getAge() + " Current Height: " + getHeight());
    }
}