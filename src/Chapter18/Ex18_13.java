package Chapter18;

import java.util.Scanner;

//Задание 18.13
//        Напишите класс, который заполняет случайными четырехзначными
//        числами массив, размер которого при инициализации вводится с клавиатуры.
//        После заполнения класс должен вывести на экран значения массива в
//        одной строке, начиная с «конца>> массива (с последней ячейки).
public class Ex18_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int a = scanner.nextInt();
        int[] array = new int[a];
        int down = 1000;
        int up = 9999;
        for (int i = 0; i <= a - 1; i++) {
            array[i] = down + (int) ((up - down + 1) * Math.random());
        }
        System.out.println("прямой порядок расположения значений в массиве");
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Обратный порядок");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
