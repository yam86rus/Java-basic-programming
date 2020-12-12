package Chapter19;

import java.util.Arrays;

//Задание 19.33
//        Напишите метод, который принимает в качестве параметра массив
//        целых чисел и возвращает сумму его элементов.
public class Ex19_33 {
    static int foo(int[] a) {
        int result = 0;
        for (int n : a) {
            result += n;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.println(Arrays.stream(array).sum());
        System.out.println(foo(array));
    }
}
