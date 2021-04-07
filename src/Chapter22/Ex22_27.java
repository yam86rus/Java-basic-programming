package Chapter22;

import java.util.Arrays;

//Задание 22.27
//        Напишите метод, который получает в качестве параметров два двумерных
//        массива целых чисел.
//        Метод должен проверить, является ли первый массив подмассивом второго.
public class Ex22_27 {
    public static boolean isIn(int[][] doubleArray, int[] array) {
        for (int i = 0; i < doubleArray.length; i++) {
            if (Arrays.equals(doubleArray[i], array)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}};
        int[] subArray = new int[]{2, 2, 2, 2};
        System.out.println(isIn(array, subArray));
    }
}
