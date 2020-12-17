package Chapter19;

import java.util.Arrays;

//Задание 19.39
//        Напишите метод, который принимает в качестве параметра массив
//        целых чисел и «переворачивает» его.
//        Например, если в качестве параметра получен массив 1, 3, 6, 2, 7, после
//        окончания работы метода содержимое массива будет 7, 2, 6, 3, 1.
public class Ex19_39 {
    static int[] foo(int[] array) {
        int[] b = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            b[(array.length - 1) - i] = array[i];
        }
        return b;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 6, 2, 7,};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(foo(a)));
    }
}
