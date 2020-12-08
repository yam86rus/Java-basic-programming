package Chapter19;

import java.util.Arrays;
import java.util.Collections;

//Задание 19.24
//        Напишите метод, который принимает в качестве параметра массив
//        целых чисел и проверяет, являются ли все элементы массива положительными
//        числами.
public class Ex19_24 {
    public static int[] fillArrayRandom(int[] arr) {
        int down = -10, up = -30;
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = up + (int) ((up - down + 1) * Math.random());
        }
        return arr;
    }

    public static boolean check(int[] ar) {
        boolean resul = false;
        for (int n : ar) {
            if (n < 0) {
                resul = true;
                break;
            }
        }
        return resul;
    }

    public static void main(String[] args) {
        int[] array = fillArrayRandom(new int[10]);

        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println(check(array));
    }
}
