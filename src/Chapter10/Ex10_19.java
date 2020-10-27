package Chapter10;

import java.util.ArrayList;

//Задание 10.19
//        Напишите класс, который генерирует и выводит на экран последовательность
//        из 5 случайных целых чисел из диапазона от -50 до 50.
//        Класс должен определить, сколько раз в этой последовательности менялся
//        знак.
//        Например: в последовательности 1, -34, 8, 14, -5 знак меняется 3 раза.
public class Ex10_19 {
    public static void main(String[] args) {
        int down = -50, up = 50;
        int a = down + (int) ((up - down + 1) * Math.random());
        int b = down + (int) ((up - down + 1) * Math.random());
        int c = down + (int) ((up - down + 1) * Math.random());
        int d = down + (int) ((up - down + 1) * Math.random());
        int e = down + (int) ((up - down + 1) * Math.random());
        int[] array = {a, b, c, d, e};
        int result = 0;
        System.out.println("Сгенерировано 5 чисел в диапазоне от " + down + " до " + up);
        for (int i : array) {
            System.out.print(i + " ");
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] > 0 && array[i - 1] < 0) result++;
            if (array[i] < 0 && array[i - 1] > 0) result++;
        }
        System.out.println();
        System.out.println("количество сменов знака = " + result);
    }
}

