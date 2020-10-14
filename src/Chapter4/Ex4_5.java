package Chapter4;

import java.util.Scanner;

//Задание 4.S
//Напишите класс, который принимает с клавиатуры целое положительное
//        двузначное число и выводит его на экран в «полном виде»: например,
//        для числа 34 это будет выглядеть как 30+4.
public class Ex4_5 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите двухзначное число");
        int a = reader.nextInt();
        System.out.println(a / 10 * 10 + "+" + a % 10);
    }
}
