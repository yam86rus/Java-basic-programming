package Chapter22;

import java.lang.reflect.Array;
import java.util.Arrays;

//Задание 22.6
//        Напишите метод, который получает в качестве параметра двумерный
//        массив целых чисел.
//        Метод возвращает массив, заполненный случайными числами из диапазона
//        10 ... 99 по следующему правилу:
//        • все ячейки первой строки заполнены первым сгенерированным
//        случайным числом;
//        • все ячейки второй строки заполнены вторым сгенерированным
//        случайным числом и так далее.
public class Ex22_6 {
    static int[][] foo(int[][] da) {
        int down = 10;
        int up = 99;
        for (int i = 0; i < da.length; i++) {
            int rn = down + (int) ((up - down + 1) * Math.random());
            for (int j = 0; j < da[i].length; j++) {
                da[i][j] = rn;
            }
        }
        return da;
    }

    public static void main(String[] args) {
        int[][] da = new int[5][5];
        int[][] da2 = foo(da);
        for (int [] i: da2){
            System.out.println(Arrays.toString(i));
        }
    }
}
