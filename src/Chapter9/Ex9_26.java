package Chapter9;

import java.util.Scanner;

//Задание 9.26
//        Назовем двузначное число «внутренним» по отношению к четырехзначному
//        числу, если какая-то пара смежных цифр в четырехзначном
//        числе образует двузначное число.
//        Напишите класс, который принимает с клавиатуры два положительных
//        числа - двузначное и четырехзначное - и проверяет, является ли двузначное
//        «внутренним» по отношению к четырехзначному.
public class Ex9_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите двухзначное число");
        int n1 = scanner.nextInt();
        System.out.println("Введите четырехзначное число");
        int n2 = scanner.nextInt();
        if (n2 / 100 == n1 || n2 % 100 == n1 || n2 / 10 % 100 == n1)
            System.out.println("Число - внутреннее");
        else System.out.println("Число не внутреннее");
    }
}
