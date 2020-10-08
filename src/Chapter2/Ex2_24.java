package Chapter2;
//Задание 2.24
//        Напишите класс, который принимает с клавиатуры два целых числа,
//        каждое из которых представляет собой размер одной из сторон прямоугольника
//        и выводит на экран следующие значения (каждое в отдельной
//        строке): площадь прямоугольника и его периметр.

import java.util.Scanner;

public class Ex2_24 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a = reader.nextInt();
        int b = reader.nextInt();
        System.out.println("Площадь прямоугольника = " + (a * b) + " ед. квадратных");
        System.out.println("Периметр прямоугольника = " + (a * 2 + b * 2 + " ед."));
    }
}
