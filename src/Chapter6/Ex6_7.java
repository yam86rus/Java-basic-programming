package Chapter6;

import java.util.Scanner;

//Задание 6.7
//        Напишите класс, который принимает с клавиатуры целое положительное
//        число и, если оно как минимум трехзначное и положительное,
//        уменьшает его на 1.
public class Ex6_7 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число");
        double number = reader.nextDouble();
        if (number > 99) {
            number -= 1;
            System.out.println(number);
        }
    }
}
