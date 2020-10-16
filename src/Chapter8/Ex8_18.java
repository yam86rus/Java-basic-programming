package Chapter8;

import java.util.Scanner;

//Задание 8.18
//        Назовем «степенью четности» числа количество четных цифр в его составе
//        (например, степень четности для 2346 равна 3).
//        Напишите класс, который принимает с клавиатуры трехзначное положительное
//        число и определяет, какова его «степень четностю>. В соответствии
//        с результатом проверки надо вывести на экран соответствующее
//        текстовое сообщение.
public class Ex8_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное трехзначное число");
        int number = scanner.nextInt();
        int count = 0;
        count += (number / 100) % 2 == 0 ? 1 : 0;
        count += (number / 10 % 10) % 2 == 0 ? 1 : 0;
        count += (number % 10) % 2 == 0 ? 1 : 0;
        System.out.println("Степень четности числа: " + number + " = " + count);
    }
}
