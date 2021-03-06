package Chapter22;

import java.util.Arrays;

//Задание 22.5
//        Напишите метод, который получает в качестве параметра двумерный
//        массив целых чисел размером 6х14.
//        Метод возвращает массив, заполненный случайными числами из диапазона
//        30 ... 125.
public class Ex22_5 {

    public static int[][] foo(int[][] da) {
        int down = 30;
        int up = 125;
        int arrSize = da.length * da[0].length;
        System.out.println(arrSize);
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                da[i][j] = down + (int) ((up - down + 1) * Math.random());
            }
        }
        return da;
    }

    public static void main(String[] args) {
        int[][] array = new int[6][14];
        array = foo(array);
        for (int[] i : array) {
            System.out.println(Arrays.toString(i));
        }
    }
}
