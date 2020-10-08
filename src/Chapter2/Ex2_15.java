package Chapter2;

import java.util.Scanner;

//Задание 2.15
//        Напишите класс, который принимает с клавиатуры целое число и выводит
//        на экран новое число, которое больше введенного с клавиатуры
//        в 10 раз.
public class Ex2_15 {
    static Scanner rearder = new Scanner(System.in);

    public static void main(String[] args) {
        int a = rearder.nextInt();
        System.out.println(a*10);
    }
}
