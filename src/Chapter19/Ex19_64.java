package Chapter19;

import java.util.Arrays;

//Задание 19.64
//        Напишите метод, который принимает в качестве параметра массив
//        целых чисел А и возвращает массив В, каждый элемент B[k] которого
//        равен сумме значений, содержащихся в массиве А от начала массива до
//        ячейки k включительно (массив частичных сумм).
public class Ex19_64 {
    //    static int sum (int[] array){
//
//    }
    static int[] foo(int[] ar, int n) {
        int result = 0;
        int[] fin = new int[n];
        for (int i = 0; i < n; i++) {
            result += ar[i];
            fin[i] = result;
        }
        return fin;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int k = 4;
        System.out.println(Arrays.toString(foo(a, k)));
    }
}
