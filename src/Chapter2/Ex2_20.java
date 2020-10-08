package Chapter2;

import java.util.Scanner;

//Задание 2.20
//        Напишите класс, который принимает с клавиатуры целое число и выводит
//        на экран следующие значения (каждое в отдельной строке): снова
//        введенное число и число, противоположное введенному числу.
public class Ex2_20 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a = reader.nextInt();
        System.out.println(a);
        System.out.println(a*-1);
    }
}
