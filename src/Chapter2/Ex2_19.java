package Chapter2;

import java.util.Scanner;

//Задание 2.19
//        Напишите класс, который принимает с клавиатуры целое число и выводит
//        на экран следующие три значения (все - в одной строке, разделенные
//        пробелом): число, меньше введенного с клавиатуры на 1,
//        число, введенное с клавиатуры, и число, больше введенного с клавиатуры
//        на 1
public class Ex2_19 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a = reader.nextInt();
        System.out.println("" + (a - 1) + " " + a + " " + (a + 1));
    }
}
