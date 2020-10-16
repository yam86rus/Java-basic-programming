package Chapter8;

import java.util.Scanner;

//Задание 8.16
//        Трехзначное число называется «симметричным», если первая и последняя
//        его цифры одинаковы.
//        Напишите класс, который принимает с клавиатуры трехзначное положительное
//        число и проверяет, является ли оно «симметричным». В соответствии
//        с результатом проверки надо вывести на экран соответствующее
//        текстовое сообщение.
public class Ex8_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое трехзначное число");
        int number = scanner.nextInt();
        String result = number / 100 == number % 10 ? "число симметричное" : "число не симметричное";
        System.out.println(result);
    }
}
