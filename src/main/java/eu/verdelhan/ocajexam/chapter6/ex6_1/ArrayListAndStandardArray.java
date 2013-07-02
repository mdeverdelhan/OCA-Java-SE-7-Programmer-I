package eu.verdelhan.ocajexam.chapter6.ex6_1;

import java.util.ArrayList;

public class ArrayListAndStandardArray {

    public static void main(String[] args) {

        // Initializing the standard array
        double temperaturesArray[] = { 24, 22, 26, 27, 27, 27, 28 };

        // Initializing the ArrayList
        ArrayList<Double> temperaturesArrayList = new ArrayList<Double>(7);
        temperaturesArrayList.add(24.0);
        temperaturesArrayList.add(22.0);
        temperaturesArrayList.add(26.0);
        temperaturesArrayList.add(27.0);
        temperaturesArrayList.add(27.0);
        temperaturesArrayList.add(27.0);
        temperaturesArrayList.add(28.0);

        // Finding the average
        double averageFromArray = getAverage(temperaturesArray);
        System.out.println("Average from a standard array: " + averageFromArray);
        double averageFromArrayList = getAverage(temperaturesArrayList);
        System.out.println("Average from a ArrayList: " + averageFromArrayList);

        // Same average value for the two structures?
        boolean sameValue = (averageFromArray == averageFromArrayList);
        System.out.println("Same value for standard array and ArrayList: " + sameValue);
    }

    /**
     * @param values the array of double values
     * @return the average value of a standard array of double values
     */
    public static double getAverage(double[] values) {
        double average = 0;
        for (double v : values) {
            average += v;
        }
        average /= values.length;
        return average;
    }

    /**
     * @param values the ArrayList of double values
     * @return the average value of an ArrayList of double values
     */
    public static double getAverage(ArrayList<Double> values) {
        double average = 0;
        for (Double v : values) {
            average += v;
        }
        average /= values.size();
        return average;
    }
}