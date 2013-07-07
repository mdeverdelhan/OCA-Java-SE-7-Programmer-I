package eu.verdelhan.ocajexam.chapter7.ex7_1;

public class MapleTree extends Plant {

    private static final int AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON = 2;

    /*
     * A tree grows upwards a certain number of feet a year. A tree does not die
     * down to ground level during the winter.
     */
    private void grow() {
        int currentHeight = getHeight();
        setHeight(currentHeight + AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON);
    }

    @Override
    public void doSpring() {
        grow();
        addYearToAge();
        System.out.println("Spring: The maple tree is starting to grow leaves and new branches");
        System.out.println("\tCurrent Age: " + getAge() + " Current Height: " + getHeight());
    }

    @Override
    public void doSummer() {
        grow();
        System.out.println("Summer: The maple tree is continuing to grow");
        System.out.println("\tCurrent Age: " + getAge() + " Current Height: " + getHeight());
    }

    @Override
    public void doFall() {
        System.out.println("Fall: The maple tree has stopped growing and is losing its leaves");
        System.out.println("\tCurrent Age: " + getAge() + " Current Height: " + getHeight());
    }

    @Override
    public void doWinter() {
        System.out.println("Winter: The maple tree is dormant");
        System.out.println("\tCurrent Age: " + getAge() + " Current Height: " + getHeight());
    }
}