package Chapter19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Задание 19.52
//        Напишите метод, который принимает в качестве параметров два массива
//        целых чисел.
//        Метод возвращает массив, содержащий значения массивов-параметров,
//        записанные по правилу «сначала одно значение из первого, потом
//        все значения из второго, потом второе значение из первого, потом
//        снова все значения из второго ... ».
//        Например, для массивов 1, 2, 3, 4 и 6, 7, 8, 9 метод возвращает массив
//        1, 6, 7, 8, 9, 2, 6, 7, 8, 9, 3, 6, 7, 8, 9, 4, 6, 7, 8, 9.
public class Ex19_52 {
    static void foo(int[] array1, int[] array2) {

        List<Integer> list1 = Arrays.stream(array1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(array2).boxed().collect(Collectors.toList());
        List<Integer> list3 = new ArrayList<>();

        for (Integer n: list1){
            list3.add(n);
            list3.addAll(list2);
        }
        System.out.println(list3);
    }

    public static void main(String[] args) {
        int[] ar1 = {1, 2, 3, 4};
        int[] ar2 = {6, 7, 8, 9};
        foo(ar1, ar2);
    }
}
