package Chapter22;

import java.util.Arrays;

//Задание 22.26
//        Напишите метод, который получает в качестве параметров два двумерных
//        массива целых чисел.
//        Метод должен проверить, являются ли массивы идентичными, то есть,
//        содержат ли ячейки с одинаковыми индексами одинаковые значения.
public class Ex22_26 {

    public static void main(String[] args) {
        int[][] firsArray = new int[][]{{1, 2, 3}, {4, 5, 6, 7}};
        int[][] secondArray = new int[][]{{1, 2, 3}, {4, 5, 6, 7}};
        int[][] thirdArray = new int[][]{{10, 20, 30}, {40, 50, 60, 70}};

        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3};
        System.out.println(Arrays.equals(a1, a2));
        System.out.println(Arrays.deepEquals(firsArray, secondArray));
        System.out.println(Arrays.deepEquals(firsArray, thirdArray));
    }
}
