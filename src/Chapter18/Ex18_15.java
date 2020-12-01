package Chapter18;

import java.util.Scanner;

//Задание 18.15
//        Напишите класс, который заполняет случайными двузначными числами
//        массив, размер которого при инициализации вводится с клавиатуры.
//        После заполнения класс должен вывести на экран значения массива
//        следующим образом:
//        • в первой строке - значения из четных ячеек массива;
//        • во второй строке - значения из нечетных ячеек массива.
public class Ex18_15 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        int a = scanner.nextInt();
        int[] array = new int[a];
        int down = 10;
        int up = 99;
        for (int i = 0; i <= a - 1; i++) {
            array[i] = down + (int) ((up - down + 1) * Math.random());
        }
        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("--------");
        for (int i = 1; i <= array.length - 1; i += 2) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i <= array.length - 1; i += 2) {
            System.out.print(array[i] + " ");
        }
    }
}
