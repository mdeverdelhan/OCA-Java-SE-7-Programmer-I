package eu.verdelhan.ocajexam.chapter8.ex8_1;

public class GoatShelter implements Describable {

    private String description;
    private int height;
    private int width;
    private int length;

    public GoatShelter(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
        description = "A goat shelter that is " + height + " high, " + length + " long and " + width + " wide";
    }

    @Override
    public String getDescription() {
        return description;
    }

    /*
     * Implement other methods for a goat shelter
     */

    public boolean isOpened() {
        return true;
    }
}