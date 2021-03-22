package Chapter22;

import java.util.Arrays;

import static Chapter22.Ex22_9.setRandomNumbersToArray;

//Задание 22.14
//        Напишите метод, который получает в качестве параметра двумерный массив целых чисел и возвращает массив (одномерный),
//        содержащий в каждой ячейке сумму значений соответствующей строки массива-параметра.
public class Ex22_14 {
    public static int[] getArrayFromDoubleArray(int[][] doubleArray) {
        int tempSumm = 0;
        int[] result = new int[doubleArray.length];

        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                tempSumm += doubleArray[i][j];
            }
            result[i] = tempSumm;
            tempSumm = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] doubleArray = new int[6][6];
        doubleArray = setRandomNumbersToArray(doubleArray);
        for (int[] x : doubleArray) {
            System.out.println(Arrays.toString(x));
        }
        System.out.println("////");
        int result[] = getArrayFromDoubleArray(doubleArray);
        System.out.println(Arrays.toString(result));

    }
}
