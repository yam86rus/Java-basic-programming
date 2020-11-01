package Chapter12;
//Задание 12.6
//        Напишите класс, который принимает с клавиатуры целое число и проверяет, на какое количество двузначных чисел оно делится.
//        Результат проверки класс должен вывести на экран вместе с соответствующим текстовым сообщением.

import java.util.Scanner;

public class Ex12_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = scanner.nextInt();
        int result = 0;
        for (int i = 10; i <= 99; i++) {
            if (a % i == 0) result++;
        }
        System.out.println("Число " + a + " делиться на " + result + " раз");
    }
}
