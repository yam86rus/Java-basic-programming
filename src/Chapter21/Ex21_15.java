package Chapter21;

import java.util.Scanner;

//Задание 21.15
//        Напишите класс, который принимает с клавиатуры строковое значение
//        и определяет, является ли оно палиндромом (симметричным).
public class Ex21_15 {
    public static void main(String[] args) {
        System.out.println("Введите любой текст");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String s1 = new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(s1));
    }
}
