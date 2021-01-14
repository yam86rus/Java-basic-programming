package Chapter19;

import java.util.Arrays;

//Задание 19.48
//        Напишите метод, который принимает в качестве параметров два массива
//        целых чисел и проверяет, содержатся ли все значения первого
//        массива во втором.
public class Ex19_48 {
    static boolean foo(int[] array1, int[] array2) {
        boolean result = true;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] != array2[j]) {
                    continue;
                }
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        System.out.println(foo(arr1, arr2));
    }
}
