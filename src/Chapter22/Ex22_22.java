package Chapter22;

import java.util.Arrays;

//Задание 22.22
//        Напишите метод, который получает в качестве параметра одномерный
//        массив положительных целых чисел.
//        Метод возвращает двумерный массив, каждая строка которого содержит в
//        первой (по счету) ячейке число из соответствующей ячейки одномерного
//        массива, а в остальных ячейках строки содержит делители этого числа.
public class Ex22_22 {
    public static int[][] getDoubleArray (int[] myArray){
        int[][] result = new int[myArray.length][myArray.length];
        for (int[] numbers: result){
            System.out.println(Arrays.toString(numbers));
        }

        for(int i=0; i<myArray.length;i++){
            result[i][0]=myArray[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5};
        System.out.println(Arrays.deepToString(getDoubleArray(myArray)));
    }
}
