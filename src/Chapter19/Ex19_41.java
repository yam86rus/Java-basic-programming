package Chapter19;

import java.util.Arrays;

//Задание 19.41
//        Напишите метод, который принимает в качестве параметра массив
//        целых чисел и возвращает новый массив с переставленными первой и
//        второй половинами.
//        Например, если в качестве параметра получен массив 1, 3, 6, 8, 2, 7 -
//        метод возвращает массив 8, 2, 7, 1, 3, 6.
public class Ex19_41 {
    static int[] foo(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i <= array.length / 2 - 1; i++) {
            newArray[i] = array[i + (array.length / 2)];
            newArray[i + array.length / 2] = array[i];

        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 8, 2, 7};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(foo(arr)));
    }
}
