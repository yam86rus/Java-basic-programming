package Chapter22;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static Chapter22.Ex22_9.setRandomNumbersToArray;

//Задание 22.10
//        Напишите метод, который получает в качестве параметра двумерный
//        массив целых чисел и возвращает сумму массива (сумму всех значений
//        в массиве).
public class Ex22_10 {
    public static void main(String[] args) {
        int result = 0;
        int[][] myArray = new int[5][5];
        myArray = setRandomNumbersToArray(myArray);
        System.out.println(Arrays.deepToString(myArray));
        for (int[] i : myArray) {
            for (int n : i) {
                result += n;
            }
        }
        System.out.println(result);
    }

}
