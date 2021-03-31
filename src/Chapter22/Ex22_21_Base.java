package Chapter22;

import java.util.Arrays;

public class Ex22_21_Base {

    public static int[][] generateArray(int days, int routes) {
        return new int[days][routes];
    }

    public static int[][] setRandomNumbersToArrayWithParam(int[][] myDoubleArray, int min, int max) {
        for (int i = 0; i < myDoubleArray.length; i++) {
            for (int j = 0; j < myDoubleArray[i].length; j++) {
                int randomNumber = min + (int) ((max - min + 1) * Math.random());
                myDoubleArray[i][j] = randomNumber;
            }
        }
        System.out.println("Содержимое массива");
        showDoubleArray(myDoubleArray);
        return myDoubleArray;
    }

    public static void showDoubleArray(int[][] doubleArray) {
        for (int[] numbers : doubleArray) {
            System.out.println(Arrays.toString(numbers));
        }
    }

    public static void showWeekInfo(int[][] doubleArray) {
        int[] result = new int[doubleArray[0].length];
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                result[j] += doubleArray[i][j];
            }
        }
        System.out.println("*********");
        System.out.println(Arrays.toString(result));
    }
}
