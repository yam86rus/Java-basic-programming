package Chapter15;

import java.util.Scanner;

//Задание 15.18
//        Напишите класс, который принимает с клавиатуры целое число и выводит
//        на экран все числа, которые можно получить из введенного за
//        счет «стирания последней цифры». Например, для введенного числа
//        52435 будут выведены на экран 5243, 524, 52, 5, О.
public class Ex15_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        int count = 1;
        while (true) {
            if (a / 10 == 0) break;
            System.out.print(a / 10 + " ");
            a /= 10;
        }

    }
}
