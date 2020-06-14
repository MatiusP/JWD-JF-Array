package by.epamtc.protsko.javafundamentals.array.task3;

public class Task_01 {

    public static double getMaxSumAdjacentElements(double[] array) {
        double maxSumAdjacentElements;

        if (array.length > 1) {
            maxSumAdjacentElements = array[0] + array[1];
            for (int currentIndex = 1; (currentIndex + 1) < array.length; currentIndex++) {
                double sumAdjacentElements = array[currentIndex] + array[currentIndex + 1];
                if (sumAdjacentElements > maxSumAdjacentElements) {
                    maxSumAdjacentElements = sumAdjacentElements;
                }
            }
        } else {
            System.out.println("It's impossible to calculate the sum of adjacent elements" +
                    " because the array contains " + array.length + " element.");
            return Double.POSITIVE_INFINITY;
        }
        return maxSumAdjacentElements;
    }


    //----- check result -----
    public static void main(String[] args) {
        double[] array = {-5, 6, -10, -20, 0, 17, 30, 16};
        double[] array2 = {10};

        System.out.println("Maximum sum of adjacent elements = " + getMaxSumAdjacentElements(array));
        System.out.println("Maximum sum of adjacent elements = " + getMaxSumAdjacentElements(array2));
    }
}
