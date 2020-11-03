package Chapter13;

import java.util.Scanner;

//Задание 13.28
//        Напишите класс, который принимает с клавиатуры две пары целых чисел:
//        • первая пара - значение и порядковый номер одного члена арифметической
//        прогрессии;
//        • вторая пара - значение и порядковый номер другого члена этой
//        же прогрессии.
//        Класс должен вывести на экран все члены этой арифметической прогрессии,
//        расположенные между двумя введенными.
//        В случае если речь идет о двух соседних членах, на экран следует вывести
//        соответствующее текстовое сообщение.
public class Ex13_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую пару. Введите значение");
        int a1 = scanner.nextInt();
        System.out.println("Введите первую пару. Введите порядковый номер");
        int n1 = scanner.nextInt();
        System.out.println("Введите вторую пару. Введите значение");
        int a2 = scanner.nextInt();
        System.out.println("Введите вторую пару. Введите порядковый номер");
        int n2 = scanner.nextInt();
        int b = Math.abs(a1-a2) / Math.abs(n1-n2);
        if (Math.abs(n1 - n2) == 1) {
            System.out.println("Это соседи");
        } else {
            for (int i = 1; i <= Math.abs(n1 - n2)+1; i++) {
                System.out.print(b * i + " ");
            }
        }
    }
}
