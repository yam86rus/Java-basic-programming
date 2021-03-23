package Chapter22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static Chapter22.Ex22_9.setRandomNumbersToArray;

//Задание 21.15
//Напишите метод, который получает в качестве параметров двумерный
//        массив целых чисел и целое число К, которое является индексом одной
//        из строк массива-параметра.
//        Метод возвращает одномерный массив, содержащий все четные значения
//        из строки К массива-параметра.
public class Ex22_15 {
    public static int[] getEvenNumbersFromDoubleArray(int[][] da, int n) {
        List<Integer> list = new ArrayList<>();
        try {
            for (int i = 0; i < da[n].length; i++) {

                if (da[n][i] % 2 == 0) {
                    list.add(da[n][i]);
                }
            }
            int[] result = list.stream().mapToInt(i -> i).toArray();
            return result;

        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
            return null;
        }
    }

    public static void main(String[] args) {
        int[][] doubleArray = new int[5][5];
        doubleArray = setRandomNumbersToArray(doubleArray);
        for (int[] n : doubleArray) {
            System.out.println(Arrays.toString(n));
        }
        System.out.println("////");
        System.out.println(Arrays.toString(getEvenNumbersFromDoubleArray(doubleArray, 5)));
    }
}
