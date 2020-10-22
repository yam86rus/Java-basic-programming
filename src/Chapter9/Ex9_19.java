package Chapter9;

import java.util.Scanner;

//Задание 9.19
//        Напишите класс, который принимает с клавиатуры два положительных
//        числа, которые должны быть длинами двух смежных сторон прямоугольника
//        или квадрата. Класс должен определить, к какой из указанных
//        двух фигур относятся введенные значения сторон.
public class Ex9_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину первой стороны");
        double a = scanner.nextDouble();
        System.out.println("Введите длину второй стороны");
        double b = scanner.nextDouble();
        String result = (a==b)? "Квадрат" : "Прямоугольник" ;
        System.out.println(result);
    }
}
