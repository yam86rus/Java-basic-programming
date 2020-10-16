package Chapter8;

import java.util.Scanner;

//Задание 8.13
//        Напишите класс, который принимает с клавиатуры двузначное положительное
//        число и проверяет, составлено ли оно из одинаковых цифр.
//        В соответствии с результатом проверки надо вывести на экран соответствующее
//        текстовое сообщение.
public class Ex8_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное двухзначное число");
        int number = scanner.nextInt();
        String result = number / 10 == number % 10 ? "Число состоит из одинаковых цифр" : "Число не состоит из одинаковых цифр";
        System.out.println(result);
    }
}
