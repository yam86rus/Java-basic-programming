package Chapter2;

import java.util.Scanner;

//Задание 2.25
//        Напишите класс, который принимает с клавиатуры три целых числа,
//        каждое из которых представляет собой размер одной из сторон параллелепипеда
//        и выводит на экран следующие значения (каждое - в отдельной
//        строке): объем, площадь каждой из граней, общую площадь и
//        общий периметр.
public class Ex2_25 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();
        System.out.println("Объем = " + a * b * c);
        System.out.println("площадь грани а c гранью b " + a * b);
        System.out.println("площадь грани а c гранью c " + a * c);
        System.out.println("Общая площадь " + a * b * c);
        System.out.println("Общий периметр " + a * 4 + b * 4 + c * 4);
    }
}
