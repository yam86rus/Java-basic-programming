package Chapter22;

import java.util.Arrays;

import static Chapter22.Ex22_9.setRandomNumbersToArray;

//Задание 22.12
//        1. Напишите метод, который получает в качестве параметров двумерный
//        массив целых чисел и целое число К, указывающее на
//        номер столбца. Метод возвращает сумму столбца К (сумму всех
//        значений в столбце номер К).
//        2. Напишите метод, который определяет, какая из сумм столбцов
//        была наибольшей.
public class Ex22_12 {
    static int getColunmSum (int[][] doubleArray, int n){
        int result=0;

        for (int i=0; i<doubleArray.length; i++){
            result += doubleArray[i][n];
        }
        return result;
    }
    public static void main(String[] args) {

        int[][] myDoubleArray = new int[5][6];
        myDoubleArray = setRandomNumbersToArray(myDoubleArray);
        for (int[] n: myDoubleArray){
            System.out.println(Arrays.toString(n));
        }
        int result = getColunmSum(myDoubleArray, 3);
        System.out.println(result);
    }
}
