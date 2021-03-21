package Chapter22;
import java.util.Arrays;

import static Chapter22.Ex22_9.setRandomNumbersToArray;
//Задание 22.13
//        1. Напишите метод, который получает в качестве параметров двумерный
//        массив целых чисел и возвращает сумму всех элементов
//        на границах массива (первая и последняя строка, первый и последний
//        столбец).
//        2. Напишите метод, который получает в качестве параметров двумерный
//        массив целых чисел и возвращает сумму всех его внутренних
//        элементов (т.е. элементов, не находящихся на границах).
//        3. Напишите класс, который заполняет двумерный массив размером
//        Sx4 случайными положительными двузначными числами до тех
//        пор, пока сумма граничных элементов не окажется равной сумме
//        внутренних.
public class Ex22_13 {
    public static int getSumOfAllElements(int[][] doubleArray){
        int result = 0;
        for (int i=0;i<doubleArray[0].length; i++){
            result += doubleArray[0][i];
        }
        for (int i=0;i<doubleArray[doubleArray.length-1].length; i++){
            result += doubleArray[doubleArray.length-1][i];
        }
        for (int i=0;i<doubleArray.length; i++){
            result += doubleArray[i][0];
        }
        for (int i=0;i<doubleArray.length; i++){
            result += doubleArray[i][doubleArray[i].length-1];
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] myDoubleArray = new int[5][5];
        setRandomNumbersToArray(myDoubleArray);
        for (int[] n: myDoubleArray){
            System.out.println(Arrays.toString(n));
        }
        int result = getSumOfAllElements (myDoubleArray);
        System.out.println(result);
    }
}
