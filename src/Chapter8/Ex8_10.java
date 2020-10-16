package Chapter8;

import java.util.Scanner;

//Задание 8.10
//        Напишите класс, который принимает с клавиатуры целое число и выводит
//        на экран его квадрат, но только в случае, если введенное число
//        отрицательно. В противном случае - на экран выводится сообщение Ошибка
public class Ex8_10 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите целое число");
        int a = reader.nextInt();
        if (a < 0) {
            System.out.println(a * a);
        } else {
            System.out.println("Ошибка");
        }
    }
}

