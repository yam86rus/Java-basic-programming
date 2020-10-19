package Chapter8;

import java.util.Scanner;

//Задание 8.2 5
//        Напишите класс, который принимает с клавиатуры целое положительное
//        число, и затем:
//        • в случае если введено четное число, - принимает с клавиатуры
//        дробное число и выводит на экран произведение этих двух чисел;
//        • в противном случае - принимает с клавиатуры целое число и выводит
//        на экран сумму этих двух чисел.
public class Ex8_25 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите целое положительное число");
        double a = reader.nextDouble();
        if (a % 2 == 0) {
            System.out.println("Вы ввели четное число, теперь введите дробное число");
            double b = reader.nextDouble();
            double result = a * b;
            System.out.println("Произведение двух числе = " + result);
        } else {
            System.out.println("Вы ввели не четное число, теперь введите целое число");
            int b = reader.nextInt();
            double result = a + b;
            System.out.println("Сумма двух чисел: " + result);
        }
    }
}
