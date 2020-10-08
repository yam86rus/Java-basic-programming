package Chapter2;

import java.util.Scanner;

//Задание 2.16
//        Напишите класс, который принимает с клавиатуры целое число и выводит
//        на экран два новых числа (каждое в отдельное строке): число,
//        больше введенного с клавиатуры на 6, и число, меньше введенного с
//        клавиатуры на 12.
public class Ex2_16 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a = reader.nextInt();
        System.out.println(a+6);
        System.out.println(a-12);
    }
}
