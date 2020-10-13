package Chapter4;

import java.util.Scanner;

//Задание 4.2
//        Напишите класс, который принимает с клавиатуры целое положительное
//        трехзначное число и выводит на экран его цифры, разделенные
//        знаком «пробел».
public class Ex4_2 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите целое положительное трехзначное число");
        int a = reader.nextInt();
        System.out.println(a / 100 + " " + (a / 10) % 10 + " " + a % 10);
    }
}
