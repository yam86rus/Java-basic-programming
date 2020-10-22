package Chapter9;

import java.util.Scanner;

//Задание 9.17
//        Напишите класс, который принимает с клавиатуры три числа и проверяет,
//        являются ли эти числа углами одного и того же треугольника.
//        По результатам проверки следует вывести на экран соответствующее
//        текстовое сообщение.
public class Ex9_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение первого угла треугольника");
        double a = scanner.nextDouble();
        System.out.println("Введите значение вторго угла треугольника");
        double b = scanner.nextDouble();
        System.out.println("Введите значение третьего угла треугольника");
        double c = scanner.nextDouble();
        if ((a + b + c) > 180) {
            System.out.println("Ошибка: Сумма не должна быть больше 180 градусов");
        } else if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Угол не может быть отрицательным или нулевым");
        } else if ((a + b + c) != 180) {
            System.out.println("Сумма углов не может быть меньше 180 градусов");
        } else {
            System.out.println("Данные углы являються углами одного треугольника");
        }
    }
}
