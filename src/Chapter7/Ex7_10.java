package Chapter7;

import java.util.Scanner;

//Задание 7.10
//        Напишите программу, которая принимает с клавиатуры число и превращает
//        его в положительное, если оно отрицательное либо в ноль во
//        всех остальных случаях.
public class Ex7_10 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число");
        int a = reader.nextInt();
        a = a < 0 ? a * -1 : 0;
        System.out.println(a);
    }
}
