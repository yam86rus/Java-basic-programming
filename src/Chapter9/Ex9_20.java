package Chapter9;

import java.util.Scanner;

//Задание 9.20
//        Напишите класс, который принимает с клавиатуры промежуток времени,
//        выраженный в секундах, и выводит на экран его же, но выраженный
//        в минутах и секундах.
//        Если промежуток времени превышает час, то надо не производить пересчет,
//        а просто вывести на экран текстовое сообщение Расчет не
//        производится.
public class Ex9_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество секунд");
        int a = scanner.nextInt();
        if (a > 3600) {
            System.out.println("Расчет не производится");
        } else {
            int res = a / 60;
            System.out.println("Минут: " + res);
        }
    }
}
