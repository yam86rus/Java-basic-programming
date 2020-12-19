package Chapter19;

import java.util.Arrays;
import java.util.stream.Stream;

//Задание 19.42
//        Напишите метод, который получает в качестве параметров два упорядоченных
//        по возрастанию массива и возвращает упорядоченный по
//        возрастанию массив, содержащий все значения обоих массивовпараметров.
public class Ex19_42 {
    static int[] foo(int[] ar1, int[] ar2) {
        int[] result = new int[ar1.length + ar2.length];
        for (int i = 0; i <= ar1.length-1; i++) {
            result[i] = ar1[i];
        }
        for (int i = 0; i <= ar2.length-1; i++) {
            result[i + ar1.length] = ar2[i];
        }
        Arrays.sort(result);
        return result;// ДОДЕЛАТЬ!
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 2, 1};
        Arrays.sort(a);
        int[] b = {10, 20, 30, 30, 20, 10};
        Arrays.sort(b);
        System.out.println("ar1 " + Arrays.toString(a));
        System.out.println("ar2 " + Arrays.toString(b));
        System.out.println("arMerge " + Arrays.toString(foo(a, b)));
    }
}
