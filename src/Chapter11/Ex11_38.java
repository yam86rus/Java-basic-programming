package Chapter11;

import java.util.Scanner;

//Задание 11.38
//        Напишите класс, который принимает с клавиатуры целое число, а затем
//        генерирует 15 случайных чисел из диапазона положительных трехзначных
//        чисел.
//        Для тех сгенерированных чисел, которые делятся без остатка на введенное с клавиатуры
//        значение , следует вывести на экран округленный в большую
//        сторону квадратный корень из первой цифры (число сотен), для остальных
//        - округленный в меньшую сторону квадратный корень из
//        второй цифры (число десятков).
public class Ex11_38 {
    public static void main(String[] args) {
        int down = 100, up = 999;
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 1; i <= 15; i++) {
            int b = down + (int) ((up - down + 1) * Math.random());
            if (b % a == 0) {
                System.out.println(Math.ceil((Math.sqrt(b / 100))));
            } else {
                System.out.println(Math.floor((Math.sqrt(b / 10 % 10))));
            }
        }
    }
}
