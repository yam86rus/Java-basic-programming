package Chapter2;

import java.util.Scanner;

//Задание 2.17
//        Напишите класс, который принимает с клавиатуры целое число и затем
//        выводит на экран его квадрат.
public class Ex2_17 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a = reader.nextInt();
        System.out.println(a*a);
    }
}
