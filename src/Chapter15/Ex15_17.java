package Chapter15;

import java.util.Scanner;

//Задание 15.17
//        Напишите класс, который принимает с клавиатуры целое положительное
//        число N и цифру D. Класс должен проверить, есть ли внутри числа
//        N цифра D, и вывести на экран соответствующее сообщение.
public class Ex15_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 1; // количество цифр в числе
        boolean result = false;
        while (true) {
            if (a / 10 == 0) {
                if (a == b) result = true;
                break;
            }
            count++;
            if (a % 10 == b) {
                result = true;
            }
            a /= 10;
        }
        System.out.println("Цифр в числе " + count);
        System.out.println(result);
    }
}
