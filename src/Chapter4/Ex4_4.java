package Chapter4;

import java.util.Scanner;

//Задание 4.4
//        Напишите класс, который принимает с клавиатуры целое положительное
//        трехзначное число и выводит на экран его цифры, разделенные
//        знаком «пробел», но в обратном порядке. То есть для числа 415 будет
//        выведено на экран 5 1 4.
public class Ex4_4 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите целое положительное трехзначное число");
        int a = reader.nextInt();
        System.out.println(a % 10 + " " + (a / 10) % 10 + " " + a / 100);
    }
}
