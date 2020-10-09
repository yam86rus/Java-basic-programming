package Chapter2;

import java.util.Scanner;

//        Задание 2.30
//        Напишите класс, который принимает с клавиатуры два целых числа,
//        образующих ответ на вопрос «который час?» (первое - часы, второе - минуты
//        например 15 и 42 ) и выводит на экран следующие значения (каждое в отдельной строке):
//        сколько секунд прошло с полуночи до «данного момента»
//        сколько минут прошло за это же время,
//        а также сколько минут осталось до полуночи.
public class Ex2_30 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите текущи час");
        int a = reader.nextInt();
        System.out.println("Введите текущую минуту");
        int b = reader.nextInt();
        int minPast, secPast, minLeft;
        minPast = a * 60 + b; // минут прошло с  полуночи
        secPast = minPast * 60; // секунд прошло с полуночи
        minLeft = 1440 - minPast; // минут осталось

        System.out.println("С полуночи до данного момента прошло секунд: " + secPast);
        System.out.println("С полуночи до данного момента прошло минут: " + minPast);
        System.out.println("До конца дня осталось минут: " + minLeft);
    }
}
