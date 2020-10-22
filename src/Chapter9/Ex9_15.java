package Chapter9;

import java.util.Scanner;

//Задание 9.15
//        Напишите класс, который принимает с клавиатуры целое число, которое
//        должно означать порядковый номер месяца. В случае если полученное
//        значение действительно соответствует порядковому номеру
//        одного из месяцев, следует вывести сезон (лето, осень, зима, весна), к
//        которому относится месяц.
//        В случае если введенное значение не является порядковым номером месяца,
//        следует вывести на экран соответствующее текстовое сообщение.
public class Ex9_15 {
    static void showInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int a = scanner.nextInt();
        if (a < 1 || a > 12) {
            System.out.println("Вы вели некорректный номер месяца");
            return;
        }
        if (a >= 3 && a <= 5) System.out.println("весна");
        if (a >= 6 && a <= 8) System.out.println("лето");
        if (a >= 9 && a <= 11) System.out.println("осень");
        if (a == 12 || a >= 1 && a <= 2) System.out.println("зима");
    }

    public static void main(String[] args) {
        showInfo();
    }
}
