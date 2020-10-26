package Chapter10;

import java.util.Scanner;

//Задание 10.12
//        Напишите класс, который повторяет предыдущее задание, но предоставляет
//        игроку получить, если он того захочет, еще и четвертую карту.
//        Это, например, можно сделать через ввод с клавиатуры значения, и,
//        если введено значение 1 (единица), то это означает согласие игрока на
//        получение четвертой карты.
public class Ex10_12 {
    public static void main(String[] args) {
        int down = 1, up = 11;
        int a = down + (int) ((up - down + 1) * Math.random());
        int b = down + (int) ((up - down + 1) * Math.random());
        int c = down + (int) ((up - down + 1) * Math.random());
        int summa = (a + b + c);
        System.out.println("Сумма трех случайных карт: " + summa);
        if (summa > 21) {
            System.out.println("Перебор");
            return;
        } else if (summa == 21) {
            System.out.println("Очко! Вы выграли!");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Еще карту? Да: 1 / Нет: 0");
            int d = scanner.nextInt();
            if (d == 1) {
                int e = down + (int) ((up - down + 1) * Math.random());
                summa += e;
            }
            System.out.println("Вы набрали: " + summa);
        }
    }
}
