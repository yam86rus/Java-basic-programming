package Chapter19;

import java.util.Arrays;
import java.util.stream.Stream;

//        Задание 19.58
//        Напишите метод, который получает в качестве параметров два массива
//        (не обязательно одинакового размера; состоящие из неповторяющихся
//        элементов) целых чисел.
//        Метод возвращает количество общих для обоих массивов значений {т.е.
//        таких значений, которые присутствуют в первом и втором массивах).
public class Ex19_58 {
    static int[] foo(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            result[i + a.length] = b[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ar1 = {1, 2, 3, 4};
        int[] ar2 = {5, 6, 7, 8};
        int[] res = foo(ar1, ar2);
        System.out.println(Arrays.toString(res));


    }
}
