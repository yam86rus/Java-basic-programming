package Chapter22;

import java.util.Arrays;

import static Chapter22.Ex22_9.setRandomNumbersToArray;

//Задание 22.20
//        Напишите метод, который получает в качестве параметра двумерный
//        массив целых чисел и возвращает сумму значений в его ячейках над
//        его левой диагональю.
//        Можно исходить из предположения, что массив-параметр имеет одинаковое количество строк и столбцов.
public class Ex22_20 {
    public static int getDiagonalSumWithDisplacement(int[][] doubleArray, int displacement) {
        int result = 0;
        for (int i = 0; i < doubleArray.length-displacement; i++) {
                result += doubleArray[i][i+displacement];
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] myDoubleArray = new int[5][5];
        myDoubleArray = setRandomNumbersToArray(myDoubleArray);
        for (int[] number : myDoubleArray) {
            System.out.println(Arrays.toString(number));
        }

        System.out.println(getDiagonalSumWithDisplacement(myDoubleArray,1));

    }
}
