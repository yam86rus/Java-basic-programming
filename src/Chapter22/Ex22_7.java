package Chapter22;

import java.util.Arrays;

//Задание 22.7
//        Напишите метод, который получает в качестве параметра двумерный
//        массив целых чисел.
//        Метод возвращает массив, заполненный следующим образом:
//        • первый (по порядку) столбец заполнен значениями 1;
//        • второй (по порядку) столбец заполнен значениями 2 и так далее.
public class Ex22_7 {
    static public int[][] foo(int[][] da) {
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                da[i][j] = j + 1;
            }
        }
        return da;
    }

    public static void main(String[] args) {
        int[][] da = new int[5][5];
        int[][] da1 = foo(da);
        for (int[] i : da1) {
            System.out.println(Arrays.toString(i));
        }
    }
}
