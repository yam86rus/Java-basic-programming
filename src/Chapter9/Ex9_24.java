package Chapter9;

import java.util.Scanner;

//Задание 9.24
//        Целое трехзначное число называется «горой», если его средняя цифра
//        больше крайних.
//        Напишите класс, который принимает с клавиатуры положительное
//        трехзначное число и проверяет, является ли оно «горой».
public class Ex9_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое трехзначное число");
        int a = scanner.nextInt();
        int n1 = a / 100;
        int n2 = a / 10 % 10;
        int n3 = a % 10;
        String result = (n2 > n1 && n2 > n3) ? "гора" : "не гора";
        System.out.println(result);
    }
}
