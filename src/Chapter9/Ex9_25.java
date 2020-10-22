package Chapter9;

import java.util.Scanner;

//Задание 9.25
//        Целое трехзначное число называется «ЯМОЙ», если его средняя цифра
//        меньше крайних.
//        Напишите класс, который принимает с клавиатуры положительное
//        трехзначное число и проверяет, является ли оно «ЯМОЙ».
public class Ex9_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое трехзначное число");
        int a = scanner.nextInt();
        int n1 = a / 100;
        int n2 = a / 10 % 10;
        int n3 = a % 10;
        String result = (n2 < n1 && n2 < n3) ? "яма" : "не яма";
        System.out.println(result);
    }
}
