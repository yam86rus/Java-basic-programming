package Chapter8;

import java.util.Scanner;

//Задание 8.15
//        Напишите класс, который принимает с клавиатуры двузначное положительное
//        число и проверяет, какая из его двух цифр является большей.
//        В соответствии с результатом проверки надо вывести на экран
//        соответствующее текстовое сообщение. Не следует выводить на экран
//        никакого сообщения, если число составлено из одинаковых цифр.
public class Ex8_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное двухзначное число");
        int number = scanner.nextInt();
        if (number / 10 > number % 10) {
            System.out.println("Первая цифра больше второй");
        } else if (number / 10 < number % 10) {
            System.out.println("Первая цифра меньше второй");
        }
    }
}
