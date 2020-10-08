package Chapter2;

import java.util.Scanner;

//Задание 2.14
//        Напишите класс, который принимает с клавиатуры целое число и выводит
//        на экран число, которое больше введенного с клавиатуры на 10.
public class Ex2_14 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
    int a = reader.nextInt();
        System.out.println(a+10);
    }
}
