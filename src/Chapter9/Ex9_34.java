package Chapter9;

import java.util.Scanner;

//Задание 9.34
//        Напишите класс, который читает с клавиатуры два символьных значения
//        и проверяет, идентичны ли они.
//        По результатам проверки следует вывести на экран соответствующее
//        сообщение.
public class Ex9_34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый символ");
        char a = scanner.next().charAt(0);
        System.out.println("Введите второй символ");
        char b = scanner.next().charAt(0);
        if (a == b) System.out.println("Символы одинаковы");
        else System.out.println("Символы разные");
    }
}
