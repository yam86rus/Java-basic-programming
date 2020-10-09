package Chapter2;

import java.util.Scanner;

//Задание 2.31
//        Кинетическая энергия тела подсчитывается как половина произведения
//        массы тела на квадрат скорости тела.
//        Напишите класс, который принимает с клавиатуры два числа, первое
//        из которых - масса тела, а второе - его скорость.
//        Класс должен подсчитать и вывести на экран значение кинетической
//        энергии тела.
public class Ex2_31 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите массу тела");
        int a = reader.nextInt();
        System.out.println("Введите скорость");
        int b = reader.nextInt();

        System.out.println("Кинетеческая энергия тела = " + ((a * b * b) / 2) + " Дж.");
    }
}
