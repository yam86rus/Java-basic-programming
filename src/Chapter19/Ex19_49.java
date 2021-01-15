package Chapter19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Задание 19.49
//        Напишите метод, который принимает в качестве параметров два массива
//        целых чисел и проверяет, является ли первый массив подмассивом
//        второго.
public class Ex19_49 {
    static void foo(int[] array1, int[] array2) {
        List<Integer> list = Arrays.stream(array2).boxed().collect(Collectors.toList());
        boolean result = true;
        for (int n : array1) {
            if (!list.contains(n)) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] ar1 = {1, 2, 3, 4};
        int[] ar2 = {1, 2, 3, 4, 5, 6};
        foo(ar1, ar2);
    }
}
