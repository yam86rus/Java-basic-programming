package Chapter13;

import java.util.Scanner;

//Задание 13.12
//        Напишите класс, который принимает с клавиатуры оценки 30 учеников
//        класса и выводит на экран:
//        • среднюю арифметическую оценку класса;
//        • число учеников, получивших неудовлетворительные оценки.
public class Ex13_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите оценку ученика");
        int b = 0;//количество учеников, получившие неуд.
        double summ = 0; // сумма всех оценок
        for (int i = 1; i <= 5; i++) {
            int a = scanner.nextInt();
            if (a == 2) b++;
            summ += a;
        }
        double avrBal = summ/5;
        System.out.println("количество учеников получившие \"неуд\" " + b);
        System.out.println("Средняя орифметическая оценка " + avrBal);

    }
}
