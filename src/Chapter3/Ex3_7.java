package Chapter3;

import java.util.Scanner;

//Задание 3.7
//        Напишите класс, который принимает с клавиатуры целое число и выводит
//        на экран три предыдущих ему целых числа, причем каждое - в
//        отдельной строке.
public class Ex3_7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = scan.nextInt();
        System.out.println(a-1);
        System.out.println(a-2);
        System.out.println(a-3);
    }
}
