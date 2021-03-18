package Chapter22;

import java.util.Arrays;

import static Chapter22.Ex22_9.setRandomNumbersToArray;

//Задание 22.11
//        1. Напишите метод, который получает в качестве параметров двумерный массив целых чисел и целое число К,
//        указывающее на
//        номер строки. Метод возвращает сумму строки К (сумму всех значений в строке номер К).
//        2. Напишите метод, который выводит на экран сумму каждой строки двумерного массива.
public class Ex22_11 {
    int rowNumber;
    private int getSumInRowArray(int[][] da, int n) {
        int result = 0;
        for (int i = 0; i < da[n].length; i++) {
            result += da[n][i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] myDoubleArray = new int[5][6];
        myDoubleArray = setRandomNumbersToArray(myDoubleArray);


        Ex22_11 ex22_11 = new Ex22_11();
        ex22_11.rowNumber = 3;
        int result = ex22_11.getSumInRowArray(myDoubleArray,ex22_11.rowNumber);

        System.out.println(Arrays.deepToString(myDoubleArray));
        System.out.println("Сумма элементов в массиве в строке " + ex22_11.rowNumber + " = " + result);


    }
}
