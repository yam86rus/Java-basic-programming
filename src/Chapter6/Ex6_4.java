package Chapter6;

import java.util.Scanner;

//Задание 6.4
//        Напишите класс, который принимает с клавиатуры целое число и, если
//        оно положительное, увеличивает его вдвое. Класс должен выводить на
//        экран новое значение.

public class Ex6_4 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите любое число");
        double number = reader.nextDouble();
        if (number > 0) {
            number *= 2;
            System.out.println(number*2);
        }
    }
}
