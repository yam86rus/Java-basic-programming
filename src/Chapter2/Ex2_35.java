package Chapter2;

import java.util.Scanner;

//Задание 2.35
//        Напишите класс, который принимает с клавиатуры два строковых значения:
//        ваше имя и вашу фамилию.
//        Класс должен вывести на экран сообщение Вас зовут, а рядом с ним
//        (через пробел) ваше имя и фамилию, введенные с клавиатуры.
public class Ex2_35 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите ваше имя:");
        String name = reader.next();
        System.out.println("Введите вашу фамилию:");
        String lastName = reader.next();
        System.out.println("Вас зовут: " + name + " " + lastName);
    }
}
