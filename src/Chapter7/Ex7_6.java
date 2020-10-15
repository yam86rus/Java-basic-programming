package Chapter7;

import java.util.Scanner;

//Задание 7.6
//        Напишите класс, который принимает с клавиатуры два числа и проверяет,
//        равны они друг другу или нет.
public class Ex7_6 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первое число");
        int a = reader.nextInt();
        System.out.println("Введите второе число");
        int b = reader.nextInt();
        String result = a == b ? "числа равны" : "числа не равны";
        System.out.println(result);
    }
}
