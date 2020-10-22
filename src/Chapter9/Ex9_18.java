package Chapter9;

import java.util.Scanner;

//Задание 9.18
//        Напишите класс, который принимает с клавиатуры три числа и проверяет,
//        являются ли эти числа длинами сторон одного и того же треугольника.
//        По результатам проверки следует вывести на экран соответствующее
//        текстовое сообщение.
public class Ex9_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину первой стороны треугольника");
        int a = scanner.nextInt();
        System.out.println("Введите длину второй стороны треугольника");
        int b = scanner.nextInt();
        System.out.println("Введите длину третьей стороны треугольника");
        int c = scanner.nextInt();
        String result = ((a + b) > c && (a + c) > b && (b + c) > a) ? "Стороны являются сторонами одного треугольника" : "стороны не являются сторонами одного треугольника";
        System.out.println(result);
    }
}
