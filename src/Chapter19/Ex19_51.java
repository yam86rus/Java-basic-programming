package Chapter19;

import java.util.Arrays;

//Задание 19.51
//        Напишите метод, который принимает в качестве параметров два массива
//        целых чисел одинаковой длины.
//        Метод возвращает массив, содержащий значения массивов-параметров,
//        записанные по правилу «ПО очереди из параллельных ячеею>.
//        Например, для массивов 1, 2, 3, 4 и 6, 7, 8, 9 метод возвращает массив
//        1, 6, 2, 7, 3, 8, 4, 9.
public class Ex19_51 {
    static int[] foo(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        int j = 0;
        for (int i = 0; i < array1.length; i++) {
            array3[j] = array1[i];
            j += 2;
        }
        int k = 1;
        for (int i = 0; i < array2.length; i++) {
            array3[k] = array2[i];
            k += 2;
        }
        return array3;
    }

    public static void main(String[] args) {
        int[] ar1 = {1, 2, 3, 4, 5};
        int[] ar2 = {6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(foo(ar1, ar2)));
    }
}
