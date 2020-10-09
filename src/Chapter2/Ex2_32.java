package Chapter2;

import java.util.Scanner;

//Задание 2.32
//        Напишите класс, который принимает с клавиатуры число и выводит на
//        экран обратное ему значение.
public class Ex2_32 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a = reader.nextInt();
        System.out.println(a*-1);
    }
}
