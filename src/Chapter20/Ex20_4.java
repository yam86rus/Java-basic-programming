package Chapter20;

import java.util.Arrays;

//Задание 20.4
//        Напишите класс, который генерирует серию из 100 случайных однозначных
//        неотрицательных чисел (цифр).
//        Класс должен подсчитать, сколько раз в этой серии встречалась каждая
//        цифра, и вывести на экран соответствующую информацию.
public class Ex20_4 {
    static void foo(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    result++;
                }

            }
            System.out.println("Цифра " + a[i] + " встречается " + result + " раз!");
            result = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        int down = 0;
        int up = 9;
        for (int i = 0; i < 10; i++) {
            int randomNumber = down + (int) ((up - down + 1) * Math.random());
            arr[i] = randomNumber;
        }
        System.out.println(Arrays.toString(arr));
        foo(arr);
    }
}
