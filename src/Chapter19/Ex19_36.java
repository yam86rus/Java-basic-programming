package Chapter19;

import java.util.Arrays;

//Задание 19.36
//        Напишите метод, который принимает в качестве параметра массив
//        целых чисел и возвращает максимальное значение массива.
public class Ex19_36 {
    static int foo(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    static int foo1(int[] array) {
        int max = array[0];
        if (array.length == 1) {
            return max;
        } else {
            for (int i = 1; i <= array.length - 1; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 2};
        int[] b = {10, 556, 30, 4, 52, 21};
        System.out.println(foo(a));
        System.out.println(foo(b));
    }
}
