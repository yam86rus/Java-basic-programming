package Chapter18;

import java.util.Scanner;

//Задание 18.12
//        Напишите класс, который заполняет случайными трехзначными числами
//        массив, размер которого при инициализации вводится с клавиатуры.
//        После заполнения класс должен вывести на экран значения массива в
//        одной строке, начиная с «начала» массива (с первой ячейки).
public class Ex18_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите размер массива");
        int a = scanner.nextInt();
        int[] array = new int[a];
        int down = 100;
        int up = 999;
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = down + (int) ((up - down + 1) * Math.random());
        }
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
