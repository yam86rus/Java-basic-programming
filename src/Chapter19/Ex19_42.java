package Chapter19;

import java.util.Arrays;

//Задание 19.42
//        Напишите метод, который получает в качестве параметров два упорядоченных
//        по возрастанию массива и возвращает упорядоченный по
//        возрастанию массив, содержащий все значения обоих массивовпараметров.
public class Ex19_42 {
    static int[] foo(int[] ar1, int[] ar2) {
        int[] result = new int[ar1.length + ar2.length];
        return result;// ДОДЕЛАТЬ!
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 2, 1};
        int[] b = {10, 20, 30, 30, 20, 10};
        System.out.println(Arrays.toString(foo(a, b)));
    }
}
