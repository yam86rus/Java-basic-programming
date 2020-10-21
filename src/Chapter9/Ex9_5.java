package Chapter9;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//Задание 9.5
//        На каждом этаже многоэтажного дома расположены три квартиры;
//        счет квартир идет слева направо. Например, на первом этаже квартира
//        № 1 расположена слева, квартира № 2 - в центре, квартира № 3 -
//        справа, и так далее.
//        Напишите класс, который принимает с клавиатуры номер квартиры и выводит
//        на экран следующую информацию: на каком этаже она расположена,
//        и какое место (слева, справа или в центре) она занимает на этом этаже.
public class Ex9_5 {
    static Scanner scanner = new Scanner(System.in);

    static void showInfo(double a) {
        System.out.println("Квартира расположена на " + (Math.ceil(a / 3)) + " этаже");
        String result;
        if (a % 3 == 1) {
            result = "слева";
        } else if (a % 3 == 2) {
            result = "по центру";
        } else {
            result = "справа";
        }
        System.out.println("Место квартиры - " + result);
    }

    public static void main(String[] args) {
        System.out.println("Введите номер квартиры");
        double a = scanner.nextDouble();
        showInfo(a);
    }
}

