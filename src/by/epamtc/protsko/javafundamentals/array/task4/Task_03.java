package by.epamtc.protsko.javafundamentals.array.task4;

public class Task_03 {

    public static int[][] getResultMatrix(int elementsCount) {
        int[][] resultMatrix = new int[elementsCount][elementsCount];

        for (int i = 0; i < resultMatrix.length; i++) {
            if (i <= (elementsCount / 2) && (i != (resultMatrix.length - i))) {
                for (int j = i; j < (resultMatrix[i].length - i); j++) {
                    resultMatrix[i][j] = 1;
                }
            } else {
                for (int j = 0; j < resultMatrix[i].length; j++) {
                    resultMatrix[i][j] = resultMatrix[elementsCount - (i + 1)][j];
                }
            }
        }
        return resultMatrix;
    }

    public static void printResultMatrix(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    //----- check result -----
    public static void main(String[] args) {
        printResultMatrix(getResultMatrix(16));
        printResultMatrix(getResultMatrix(15));
    }
}
