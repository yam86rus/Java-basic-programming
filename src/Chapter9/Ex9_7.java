package Chapter9;

import java.util.Scanner;

//Задание 9.7
//        Напишите класс, который принимает с клавиатуры два числа, которые
//        должны быть значениями двух углов в треугольнике. Класс должен определять,
//        о каком из следующих типов треугольников идет речь: остроугольный,
//        тупоугольный, прямоугольный, равнобедренный, равносторонний
//        (возможно, что треугольник относится сразу к двум типам).
//        В случае если введенные с клавиатуры данные (или хотя бы одно из
//        них) не могут быть углами треугольника, следует вывести на экран сообщение
//        Ошибочные данные.
public class Ex9_7 {
    static void showInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый угол треугольника в градусах");
        double a = scanner.nextDouble();
        System.out.println("Введите второй угол треугольника в градусах");
        double b = scanner.nextDouble();

        if (a > 180 || b > 180) {
            System.out.println("Угол не может быть больше 180 градусов");
            return;
        }
        if ((a + b) > 180) {
            System.out.println("Сумма углов не может быть больше 180 градусов");
            return;
        }
        double c = 180 - a + b; // третий угол
        if (a == b && b == c) {
            System.out.println("Треугольник - равносторонний. Все углы по 60 градусов");
        }
        if (a == b || b == c || a == c) {
            System.out.println("Треугольник - равнобедренный");
        }
        if (a > 90 && a < 180 || b > 90 && b < 180 || c > 90 && c < 180) {
            System.out.println("Треугольник - тупоугольный");
        }
        if (a == 90 || b == 90 || c == 90) {
            System.out.println("Трегольника - прямоугольный");
        }
        if (a < 90 && b < 90 && c < 90) {
            System.out.println("Треугольник - остроугольный");
        }
    }

    public static void main(String[] args) {
        showInfo();
    }
}
