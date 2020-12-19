package Chapter19;

import java.lang.reflect.Array;
import java.util.*;

//Задание 19.43
//        Напишите метод, который получает в качестве параметров два упорядоченных
//        по возрастанию массива и возвращает упорядоченный по возрастанию
//        массив, содержащий значения обоих массивов-параметров, но
//        без повторов значений.
//        Например, если массивы-параметры содержат 1, 3, 5, 7 и 2, 5, 7, 9, 11, то
//        выходной массив содержит значения 1, 2, 3, 5, 7, 9, 11.
public class Ex19_43 {
    static List<Integer> foo(int[] ar1, int[] ar2) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < ar1.length; i++) {
            if (!list.contains(ar1[i])) {
                list.add(ar1[i]);
            }
        }

        for (int i = 0; i < ar2.length; i++) {
            if (!list.contains(ar2[i])) {
                list.add(ar2[i]);
            }
        }
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 5, 6, 6, 7, 7, 8, 8, 8};
        System.out.println(Arrays.toString(a));
        int[] b = {9, 11, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(b));
        System.out.println(foo(a, b));
    }
}
