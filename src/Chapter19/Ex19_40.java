package Chapter19;

import java.util.Arrays;

//Задание 19.40
//        Напишите метод, который принимает в качестве параметра массив целых
//        чисел и возвращает новый массив, который содержит те же значения, что
//        и массив, полученный в качестве параметра, но в обратном порядке.
//        Например, если в качестве параметра получен массив 1, 3, 6, 2, 7 - метод
//        возвращает массив 7, 2, 6, 3, 1.
public class Ex19_40 {
    static int[] foo(int[] ar) {
        int[] result = new int[ar.length];
        for (int i = 0; i <= ar.length - 1; i++) {
            result[(ar.length-1) - i] = ar[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 6, 2, 7};
        System.out.println(Arrays.toString(array));
        int[] arrayReverse = foo(array);
        System.out.println(Arrays.toString(arrayReverse));
    }
}
