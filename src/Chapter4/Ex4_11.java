package Chapter4;

import java.util.Scanner;

//Задание 4.11
//        Назовем «длиной двузначного числа» разницу между числом десятков
//        (первая цифра) и числом единиц (вторая цифра).
//        Напишите класс, который принимает с клавиатуры двузначное число и
//        выводит на экран его «длину».
public class Ex4_11 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите двухзначное целое число");
        int a = reader.nextInt();
        int result = a / 10 - a % 10;
        System.out.println(result);
    }
}
