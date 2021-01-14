package Chapter19;

import java.util.Arrays;

//Задание 19.47
//        Напишите метод, который принимает в качестве параметров два массива
//        целых чисел одинаковой длины и проверяет, являются ли массивы
//        идентичными.
public class Ex19_47 {
    static boolean foo(int[] ar1, int[] ar2) {
        boolean result = true;
        for (int i = 0; i < ar1.length; i++) {
            if (ar1[i] != ar2[i]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4, 5};
//        int[] b = {3, 4, 5, 6, 7};
        System.out.println(foo(a, b));
    }
}
