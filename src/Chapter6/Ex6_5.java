package Chapter6;

//Задание 6.5
//Напишите класс, который принимает с клавиатуры целое число и, если
//        оно равно нулю, выводит на экран сообщение Ноль.

import java.util.Scanner;

public class Ex6_5 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число");
        double number = reader.nextDouble();
        if (number == 0) System.out.println("Ноль");
    }
}
