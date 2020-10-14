package Chapter4;

import java.util.Scanner;

//Задание 4.6
//        Напишите класс, который принимает с клавиатуры целое положительное
//        трехзначное число и выводит его на экран в «полном виде»: например,
//        для числа 364 это будет выглядеть как 300+60+4.
public class Ex4_6 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите целое положительное трехзначное число");
        int a = reader.nextInt();
        System.out.println(a / 100 * 100 + "+" + a / 10 % 10 * 10 + "+" + a % 10);
    }

}
