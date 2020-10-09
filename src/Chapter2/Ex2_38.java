package Chapter2;

import java.util.Scanner;

//Задание 2.38
//        Напишите класс, который принимает с клавиатуры фамилию, имя и
//        отчество, а затем выводит на экран инициалы (без пробела между
//        инициалами).
public class Ex2_38 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите фамилию");
        String lastName = reader.next();
        System.out.println("Введите имя");
        String name = reader.next();
        System.out.println("Введите отчество");
        String surName = reader.next();

        System.out.println("" + lastName + " " + name.charAt(0) + "." + surName.charAt(0) + ".");
    }
}
