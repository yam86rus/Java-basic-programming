package Chapter22;

import java.util.Arrays;

//Задание 22.9
//        Напишите метод, который получает в качестве параметров двумерный
//        массив целых чисел и целое число Х.
//        Метод определяет, в каком количестве ячеек массива-параметра содержится
//        значение Х, и возвращает полученный результат.
public class Ex22_9 {
    static int[][] setRandomNumbersToArray(int[][] da) {
        int down = 1;
        int up = 3;
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
            int rn = down + (int) ((up - down + 1) * Math.random());
                da[i][j] = rn;
            }
        }
        return da;
    }

    static int countNumberInDoubleArray(int[][] da, int n) {
        int result = 0;
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                if (n == da[i][j]) {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] myArray = new int[5][5];
        myArray = setRandomNumbersToArray(myArray);
        System.out.println(Arrays.deepToString(myArray));
        System.out.println(countNumberInDoubleArray(myArray, 2));

    }
}
