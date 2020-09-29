package Chapter6;

import java.util.Scanner;

//Задание 6.8
//        Напишите класс, который принимает с клавиатуры два целых числа и,
//        если первое больше второго, выводит на экран их сумму, если же наоборот
//        - выводит на экран их произведение. В случае же, если числа
//        одинаковы, программа выводит на экран сообщение Числа равны.
public class Ex6_8 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первое число");
        double a = reader.nextDouble();
        System.out.println("Введите второе число");
        double b = reader.nextDouble();
        if (a>b) {
            System.out.println(a+b);
        } else if(a<b) {
            System.out.println(a*b);
        } else {
            System.out.println("Числа равны");
        }
    }
}
