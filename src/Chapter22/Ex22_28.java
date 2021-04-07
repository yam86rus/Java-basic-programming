package Chapter22;

import java.util.Arrays;

import static Chapter22.Ex22_21.setRandomNumbersToArrayWithParam;

//Задание 22.28
//        Внутренний элемент двумерного массива называется «локальным максимумом
//        », если его значения больше значений всех 8 соседних ячеек.
//        Глобальный максимум массива это самое большое значение, которое в
//        нем находится.
//        1. Напишите метод, который получает в качестве параметра двумерный
//        массив целых чисел и два дополнительных целых параметра
//        С и К, определяющих местоположение внутреннего элемента
//        массива. Метод должен проверить, является ли данный
//        элемент массива локальным максимумом.
//        2. Напишите метод, который получает в качестве параметра двумерный
//        массив целых чисел и выводит на экран координаты всех
//        локальных максимумов.
//        3. Напишите метод, который проверяет, является ли глобальный
//        максимум одновременно и локальным.
public class Ex22_28 {
    public static int getGlobalMax(int[][] doubleArray) {
        int result = doubleArray[0][0];
        for (int[] numbers : doubleArray) {
            int temp = Arrays.stream(numbers).max().orElse(0);
            if (temp > result) {
                result = temp;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[][] myDoubleArray = setRandomNumbersToArrayWithParam(new int[4][4], 1, 100);
//        int[][] myDoubleArray = {
//                {1, 2, 3, 4},
//                {5, 6, 5, 4},
//                {3, 2, 1, 1}
//        };
        int globalMax = getGlobalMax(myDoubleArray);
        System.out.println("Глобальный максимум в массиве " + globalMax);
    }

}
