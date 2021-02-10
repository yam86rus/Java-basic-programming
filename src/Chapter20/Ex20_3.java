package Chapter20;

import java.util.Arrays;

//Задание 20.3
//        Напишите класс, который генерирует серию из 2000 целых случайных
//        чисел из диапазона О ... 9999.
//        Класс должен определять, сколько раз в серии встречались однозначные
//        числа, сколько раз - двузначные, сколько раз - трехзначные,
//        сколько раз - четырехзначные.
//        Итоговую информацию следует вывести на экран.
public class Ex20_3 {
    static void foo(int[] a) {
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0;
        for (int number : a) {
            int result = foo1(number);
            if (result == 1) n1++;
            if (result == 2) n2++;
            if (result == 3) n3++;
            if (result == 4) n4++;
        }
        System.out.println("Однозначные числа " + n1);
        System.out.println("Двузначные числа " + n2);
        System.out.println("Трехзначные числа " + n3);
        System.out.println("Четырехзначные числа " + n4);
    }

    static int foo1(int number) {
        int result = 0;
        while (number > 0) {
            number /= 10;
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        int down = 0;
        int up = 9999;
        int[] array = new int[2000];

        for (int i = 0; i < array.length; i++) {
            int random = down + (int) ((up - down + 1) * Math.random());
            array[i] = random;
        }
        System.out.println(Arrays.toString(array));
        foo(array);
    }
}

