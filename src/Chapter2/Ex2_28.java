package Chapter2;

import java.util.Scanner;

//Задание 2.28
//        Напишите класс, который принимает с клавиатуры целое число, представляющее
//        собой расстояние в единицах, принятых на флоте - в кабельтовых.
//        После этого следует вывести на экран это же расстояние в
//        метрах и километрах. Известно, что 1кабельтов=185.2 метра.
public class Ex2_28 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a = reader.nextInt();
        System.out.println("Расстояние в метрах: " + a * 185.2);
        System.out.println("Расстояние в километрах: " + a * 0.1852);
    }
}
