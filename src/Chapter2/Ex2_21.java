package Chapter2;

import java.util.Scanner;

//Задание 2.21
//        Напишите класс, который принимает с клавиатуры целое число и выводит
//        на экран следующие значения (каждое в отдельной строке): три
//        целых числа, следующих за значением, введенным с клавиатуры.
public class Ex2_21 {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a = reader.nextInt();
        System.out.println("" + (a + 1) + " " + (a + 2) + " " + (a + 3));
    }
}
