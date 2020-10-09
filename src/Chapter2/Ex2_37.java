package Chapter2;

import java.util.Scanner;

//Задание 2.37
//        Напишите класс, который принимает с клавиатуры имя и фамилию
//        ученика.
//        Класс должен вывести на экран в одной строке сначала фамилию, а
//        после нее имя ученика, а во второй строке - сначала имя, а после
//        него - фамилию ученика.
public class Ex2_37 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите имя:");
        String name = reader.next();
        System.out.println("Введите фамилию");
        String lastname = reader.next();
        System.out.println(lastname + " " + name);
        System.out.println(name + " " + lastname);
    }
}
