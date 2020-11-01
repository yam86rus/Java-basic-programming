package Chapter12;

import java.util.Scanner;

//Задание 12.14
//        Серия случайных чисел называется «уравновешенной», если количество положительных и
//        отрицательных чисел в серии - одинаково.
//        Напишите класс, который генерирует серию из 30 случайных целых
//        чисел из диапазона от -20 до 20 и проверяет, является ли серия «уравновешенной)>.
public class Ex12_14 {
    public static void main(String[] args) {
        int down = -20, up = 20;
        int a = 0; // Больше 0
        int b = 0; // Меньше 0
        for (int i = 1; i <= 30; i++) {
            int n = down + (int) ((up - down + 1) * Math.random());
            if (n > 0) a++;
            if (n < 0) b++;
        }
        String result = (a == b) ? "уравновешена" : "не уравновешена";
        System.out.println(result);
    }
}
