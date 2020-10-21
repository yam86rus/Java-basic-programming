package Chapter9;

import java.util.Scanner;

//Задание 9.11
//        Трехзначное число называется «плоским», если оно составлено из одинаковых
//        цифр. Напишите класс, который принимает с клавиатуры
//        трехзначное число и проверяет, является ли оно «плоским». В соответствии
//        с результатом проверки надо вывести на экран соответствующее
//        текстовое сообщение.
public class Ex9_11 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите трехзначное число");
        int a = scanner.nextInt();
        if (a / 100 == a / 10 % 10 && a / 10 % 10 == a % 10) {
            System.out.println("Число - плоское");
        } else {
            System.out.println("Число не плоское");
        }
    }
}
