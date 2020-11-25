package Chapter15;

import java.util.Scanner;

//Задание 15.48
//        На прогулочном пароходе есть определенное количество мест для
//        взрослых и определенное количество мест для детей.
//        Напишите класс, который принимает с клавиатуры два целых положительных
//        числа: количество мест для взрослых и количество мест для детей.
//        Затем класс должен принять пары целых чисел: первое число в паре -
//        количество билетов для взрослых, второе - количество билетов для детей,
//        которое покупает очередная группа. Продажа билетов заканчивается
//        либо когда очередная пара содержит хотя бы одно неположительное значение,
//        либо когда нет возможности выполнить очередной заказ.
//        Класс должен вывести на экран следующую итоговую информацию:
//        • число групп, купивших билеты;
//        • количество взрослых и количество детей на пароходе;
//        • количество непроданных взрослых и детских мест.
public class Ex15_48 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество мест для взрослых");
        int a = scanner.nextInt();
        System.out.println("Введите количество мест для детей");
        int b = scanner.nextInt();
        scanner.nextLine();
        int n1 = 0; // число групп, купивших билеты
        int n2 = 0; // количество взрослых на пароходе;
        int n3 = 0; // количество детей на пароходе;
        int n4 = 0; // количество непроданных взрослых и детских мест.

        while (true) {
            System.out.println("Введите пару чисел");
            String s = scanner.nextLine();
            String[] strings = s.split(" ");
            int f1 = Integer.parseInt(strings[0]);
            int f2 = Integer.parseInt(strings[1]);

            if (f1 < 0 || f2 < 0) break;
            if (a - f1 < 0 || b - f2 < 0) break;
            a -= f1;
            b -= f2;
            n1++;
            n2 += f1;
            n3 += f2;

        }
        System.out.println("число групп, купивших билеты " + n1);
        System.out.println("количество взрослых на пароходе " + n2);
        System.out.println("количество детей на пароходе " + n3);
        System.out.println("количество непроданных взрослых билетов " + (a));
        System.out.println("количество непроданных детских билетов билетов " + (b));
        scanner.close();

    }
}