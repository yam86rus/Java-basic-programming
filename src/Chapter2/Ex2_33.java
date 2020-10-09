package Chapter2;

import java.util.Scanner;

//Задание 2.33
//        Напишите класс, который принимает с клавиатуры три числа: значения
//        оснований трапеции и ее высоту.
//        Класс должен подсчитать и вывести на экран площадь этой трапеции.
public class Ex2_33 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите длину 1-ого сонования трапеции(а)");
        double a = reader.nextDouble();
        System.out.println("Введите длину 2-ого сонования трапеции(b)");
        double b = reader.nextDouble();
        System.out.println("Введите высоту трапеции");
        double h = reader.nextDouble();
        double s = ((a + b) / 2) * h; // площадь трапеции через основания и высоту
        System.out.println("Площадь трапеции равна = " + s + " ед2.");

    }
}
