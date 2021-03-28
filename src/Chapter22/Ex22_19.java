package Chapter22;
import java.util.Arrays;

import static Chapter22.Ex22_9.setRandomNumbersToArray;
//Задание 22.19
//        197
//        Напишите метод, который получает в качестве параметра двумерный
//        массив целых чисел и возвращает сумму значений в его левой
//        диагонали.
//        Можно исходить из предположения, что массив-параметр имеет одинаковое
//        количество строк и столбцов.
public class Ex22_19 {
    public static int getDiagonalSum(int[][] doubleArray){
        int result=0;
        for(int i=0; i<doubleArray.length; i++){
        result +=doubleArray[i][i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] myDoubleArray = new int[5][5];
        myDoubleArray = setRandomNumbersToArray(myDoubleArray);
        for(int[] numbers: myDoubleArray){
            System.out.println(Arrays.toString(numbers));
        }
        System.out.println("*****");
        System.out.println(getDiagonalSum(myDoubleArray));
    }
}
