package Chapter9;

import java.util.Scanner;

//Задание 9.23
//        Целое трехзначное число называется «дважды четным», если и сумма
//        его цифр, и их произведение являются четными.
//        Напишите класс, который принимает с клавиатуры положительное
//        трехзначное число и проверяет, является ли оно «дважды четным».
public class Ex9_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое трехзначное число");
        int a = scanner.nextInt();
        int n1 = a / 100;
        int n2 = a / 10 % 10;
        int n3 = a % 10;
        String result = ((n1 + n2 + n3) % 2 == 0 && (n1 * n2 * n3) % 2 == 0) ? "Дважды четное" : "Не дважды четное";
        System.out.println(result);
    }
}
