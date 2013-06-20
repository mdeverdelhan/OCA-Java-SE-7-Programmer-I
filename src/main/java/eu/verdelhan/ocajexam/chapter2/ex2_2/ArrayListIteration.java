package eu.verdelhan.ocajexam.chapter2.ex2_2;

import java.util.ArrayList;

public class ArrayListIteration {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Creating the ArrayList
        ArrayList<Float> fishLengthList = new ArrayList<Float>();

        // Adding the floats
        fishLengthList.add(10.0f);
        fishLengthList.add(15.5f);
        fishLengthList.add(18.0f);
        fishLengthList.add(29.5f);
        fishLengthList.add(45.5f);

        // Printing out only the numbers larger than the required length
        final float requiredLength = 28f;
        for (Float length : fishLengthList) {
            if (length >= requiredLength) {
                System.out.println(length);
            }
        }
    }
}
