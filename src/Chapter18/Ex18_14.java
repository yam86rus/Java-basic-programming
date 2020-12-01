package Chapter18;

import java.util.Scanner;

//Задание 18.14
//        Напишите класс, который заполняет случайными трехзначными числами
//        массив, размер которого при инициализации вводится с клавиатуры.
//        После заполнения класс должен вывести на экран значения массива
//        следующим образом:
//        • в первой строке - первую половину массива;
//        • во второй строке - вторую половину массива.
//        В случае если массив имеет нечетный размер, центральную ячейку
//        следует выводить в первой строке.
public class Ex18_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int a = scanner.nextInt();
        int down = 100;
        int up = 999;
        int[] array = new int[a];
        for (int i = 0; i <= a - 1; i++) {
            array[i] = down + (int) ((up - down + 1) * Math.random());
        }
        System.out.println("Получился следующий массив");
        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.println();
        if (array.length % 2 != 0) {
            for (int i = 0; i <= (array.length ) / 2; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
            for (int i = (array.length / 2)+1; i <= array.length - 1; i++) {
                System.out.print(array[i] + " ");
            }

        } else {
            for (int i = 0; i <= (array.length - 1) / 2; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
            for (int i = array.length / 2; i <= array.length - 1; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
