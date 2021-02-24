package Chapter21;

import java.util.Scanner;

//Задание 21.17
//        Напишите метод, который получает в качестве параметра символ цифры
//        ('О','1', .. .'9'). Метод возвратит численное значение полученного параметра.
public class Ex21_17 {
    public static void main(String[] args) {
        System.out.println("Введите цифру от 1 до 9");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Ваше число " + a);
    }
}
