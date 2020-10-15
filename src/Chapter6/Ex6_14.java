package Chapter6;

import java.util.Scanner;

//Задание 6.14
//        Напишите класс, который принимает с клавиатуры два значения: первое
//        - числитель дроби, второе - ее знаменатель (можно исходить из
//        предположения, что второе значение отлично от нуля).
//        Класс должен определить, является ли эта дробь положительной или
//        отрицательной, и вывести на экран соответствующее текстовое сообщение.
public class Ex6_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числитель дроби");
        double a = scanner.nextDouble();
        System.out.println("Введите знаменатель дроби");
        double b = scanner.nextDouble();
        if (a / b > 0) {
            System.out.println("положительная");
        } else {
            System.out.println("отрицательная");
        }

//        решение из учебника
//        if (a*b>0)
//            System.out.println("Пoлoжитeльнaя");
//        else
//        System.out.println("Oтpицaтeльнaя");

    }
}
