package Chapter6;

import java.util.Scanner;

//Задание 6.13
//        Напишите класс, который принимает с клавиатуры два значения: первое
//        - числитель дроби, второе - ее знаменатель.
//        Класс должен определить, является ли эта дробь «законной» (существующей),
//        и вывести на экран соответствующее текстовое сообщение.
public class Ex6_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числитель дроби");
        int a = scanner.nextInt();
        System.out.println("Введите знаменатель дроби");
        int b = scanner.nextInt();
        if (b == 0 | a == 0) {
            System.out.println("Не существует");
        } else {
            System.out.println("Существует");
        }

    }
}
