package Chapter9;

import java.util.Scanner;

//Задание 9 .21
//        Напишите класс, который принимает с клавиатуры временной интервал,
//        выраженный в секундах, и выводит на экран тот же интервал, но
//        выраженный в часах, минутах и секундах.
//        Если промежуток времени превышает сутки, то надо не производить
//        пересчет, а просто вывести на экран текстовое сообщение Расчет не
//        производится.
public class Ex9_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество секунд");
        int a = scanner.nextInt();
        if (a > 86400) {
            System.out.println("Расчет не производиться");
        } else {
            int hour = a / 3600;
            int min = (a / 60)-(60 * hour);
            System.out.println("Часов: " + hour);
            System.out.println("Минут: " + min);
        }
    }

}
