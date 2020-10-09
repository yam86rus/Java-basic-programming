package Chapter3;

import java.util.Scanner;

//Задание 3.5
//        Напишите класс, который принимает с клавиатуры три числа: длины
//        двух катетов и гипотенузы прямоугольного треугольника, и выводит
//        на экран площадь и периметр этого треугольника.
//        При решении следует предусмотреть возможность того, что размеры
//        сторон треугольника не выражаются целыми числами.
public class Ex3_5 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Укажите длину первой катеты");
        int a = scan.nextInt();
        System.out.println("Укажите длину второй катеты");
        int b = scan.nextInt();
        System.out.println("Укажите длину второй гипотенузы");
        int c = scan.nextInt();
        int per = a + b + c; // периметр треугольника
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Площадь треугольника по трем сторонам = " + s);

    }
}
