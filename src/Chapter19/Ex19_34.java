package Chapter19;

import java.util.Arrays;

//Задание 19.34
//        Напишите метод, который принимает в качестве параметра массив
//        целых чисел и возвращает число ячеек массива, содержащих значения
//        большие среднего арифметического массива.
public class Ex19_34 {
    static int foo(double[] a) {
        double avr = Arrays.stream(a).sum() / a.length;
        System.out.println("avr " + avr);
        int result = 0;
        for (double d : a) {
            if (d > avr) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        double[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(foo(array));
    }
}
