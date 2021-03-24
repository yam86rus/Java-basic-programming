package Chapter22;

import java.util.Arrays;

import static Chapter22.Ex22_9.setRandomNumbersToArray;

//Задание 22.16
//        Напишите метод, который получает в качестве параметра двумерный
//        массив целых чисел и возвращает максимальное значение, содержащееся
//        в массиве.
public class Ex22_16 {
    public static int getMaxIntInDoubleArray(int[][] doubleArray) {
        int result = 0;
        for (int[] n : doubleArray) {
            for (int number : n) {
                if (number > result) {
                    result = number;
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[][] doubleArray = new int[4][4];
        doubleArray = setRandomNumbersToArray(doubleArray);
        for (int[] n : doubleArray) {
            System.out.println(Arrays.toString(n));
        }
        System.out.println(getMaxIntInDoubleArray(doubleArray));
    }
}
