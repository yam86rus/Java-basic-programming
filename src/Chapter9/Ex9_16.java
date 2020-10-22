package Chapter9;

import org.junit.Assert;
import org.junit.Test;
import java.util.Scanner;

//Задание 9.16
//        Определим следующие периоды в течение суток: утро - с 6 (включая)
//        до 10 (не включая) часов, день - с 10 (не включая) до 18 (включая}, вечер
//        - с 18 (не включая) до 22 (включая}, ночь - с 22 (не включая) до
//        6 часов следующего дня (не включая).
//        Напишите класс, который принимает с клавиатуры целое число, которое
//        должно указывать на определенный час в сутках, и выводит на экран
//        сообщение, к какому периоду в сутках этот час относится. В случае
//        если введенное значение не позволяет выполнить указанное действие,
//        следует вывести на экран соответствующее текстовое сообщение.

public class Ex9_16 {
    static String showInfo(int hour) {
        String result;
        if (hour >= 6 && hour < 10) return result = "Утро";
        if (hour > 10 && hour <= 18) return result = "День";
        if (hour > 18 && hour <= 22) return result = "Вечер";
        if (hour > 22 && hour <= 24 || hour > 0 && hour < 6) return result = "Ночь";
        else return result = "Не верно указан час";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер часа");
        int hour = scanner.nextInt();
        System.out.println(showInfo(hour));
    }
}
