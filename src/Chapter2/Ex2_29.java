package Chapter2;

import java.util.Scanner;

//Задание 2.29
//        Напишите класс, который принимает с клавиатуры целое число, представляющее
//        собой промежуток времени в часах, и выводит на экран этот же промежуток времени,
//но выраженный в секундах
public class Ex2_29 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a = reader.nextInt();
        System.out.println("" + a + " ч. = " + (a*60) + " мин.");
    }

}
