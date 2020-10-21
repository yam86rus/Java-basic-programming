package Chapter9;

import java.util.Scanner;

//Задание 9.6
//        Напишите класс, который принимает с клавиатуры три положительных
//        числа и проверяет, могут ли они являться длинами сторон треугольника.
//        По результатам проверки следует вывести на экран соответствующее
//        текстовое сообщение.
public class Ex9_6 {
    static void showInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину 1-й стороны треугольника");
        int a = scanner.nextInt();
        System.out.println("Введите длину 2-й стороны треугольника");
        int b = scanner.nextInt();
        System.out.println("Введите длину 3-й стороны треугольника");
        int c = scanner.nextInt();
        String result = ((a + b) > c && (a + c) > b && (b + c) > a) ? "Да, могут являться сторонами одного треугольника" : "Нет, не могут являться сторонами одного треугольника";
        System.out.println(result);
    }

    public static void main(String[] args) {
        showInfo();
    }
}
