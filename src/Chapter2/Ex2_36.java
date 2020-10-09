package Chapter2;

import java.util.Scanner;

//Задание 2.36
//        Напишите класс, который принимает с клавиатуры фамилию пассажира
//        и город, в который он вылетает.
//        Класс должен построить строковую переменную, которая будет содержать
//        сообщение Пассажир ... въmетает в ... , в котором вместо многоточий
//        будут фигурировать фамилия пассажира и название города, в который
//        он вылетает. Эту строковую переменную следует вывести на экран.
public class Ex2_36 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите вашу фамилию");
        String lastName = reader.next();
        System.out.println("Введите город");
        String city = reader.next();
        String message = "Пассажир " + lastName + " вылетает в " + city +".";
        System.out.println(message);
    }

}
