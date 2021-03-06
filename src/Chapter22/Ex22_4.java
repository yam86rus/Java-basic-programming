package Chapter22;

import java.util.Arrays;

//Задание 22.4
//        Напишите метод, который получает в качестве параметра двумерный
//        массив целых чисел и выводит его на экран в табличной форме.
public class Ex22_4 {
    static void foo(int[][] da) {
        for (int[] i : da) {
            System.out.println(Arrays.toString(i));
        }
    }

    public static void main(String[] args) {
        int[][] da = {{1, 2, 3}, {3, 4, 5}, {6, 7, 8}};
        foo(da);
    }
}
