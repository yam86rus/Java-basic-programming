package Chapter9;

import java.util.Scanner;

//Задание 9.35
//        Напишите класс, который читает с клавиатуры символ и проверяет,
//        является ли введенный символ буквой латинского алфавита. По результатам
//        проверки следует вывести на экран соответствующее сообщение.
public class Ex9_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите символ");
        char a = scanner.next().charAt(0);
        if (a>=0 && a <=127) {
            System.out.println("Основная латиница");
        } else {
            System.out.println("Не основная латиница");
        }
    }
}
