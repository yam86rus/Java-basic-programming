package Chapter2;

import java.util.Scanner;

//Задание 2.39
//        Напишите класс, который принимает с клавиатуры фамилию, имя и
//        отчество, а затем строит строковое значение по следующему правилу:
//        первая буква имени, точка, первая буква отчества, точка, пробел, фамилия.
//        Затем это строковое значение следует вывести на экран.
//        Например, если с клавиатуры были введены значения
//        Иван
//        Иванович
//        Иванов,
//        то на экран следует вывести значение И. И. Иванов.
public class Ex2_39 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите фамилию");
        String lastName = reader.next();
        System.out.println("Введите имя");
        String name = reader.next();
        System.out.println("Введите отчество");
        String surName = reader.next();

        System.out.println("" + name.charAt(0) + "." + surName.charAt(0) + ". " + lastName);
    }
}
