package Chapter7;

import java.util.Scanner;

//Задание 7.9
//        Напишите класс, который принимает с клавиатуры три числа: два первых
//        должны быть длинами сторон катетов прямоугольного треугольника,
//        а третье - длиной гипотенузы. Программа должна проверить,
//        соответствуют ли введенные значения этому требованию.
//        Внимание: допустимо предположить, что все вводимые чиО1а - положительные.
public class Ex7_9 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите длинну первой стороны прямоугольного трейгольника");
        int a = reader.nextInt();
        System.out.println("Введите длинну второй стороны прямоугольного трейгольника");
        int b = reader.nextInt();
        System.out.println("Введите длину гипотенузы");
        int c = reader.nextInt();
        double c1 = Math.sqrt(a * a + b * b); // Длина гипотенузы по теореме Пифагора
        String result = c == c1 ? "Значения соответствуют" : "Значения не соответствуют";
        System.out.println(result);
    }
}
