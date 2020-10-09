package Chapter2;

import java.util.Scanner;

//Задание 2.27
//        Напишите класс, который принимает с клавиатуры целое число, представляющее
//        собой массу тела в граммах, и выводящую на экран массу
//        этого тела в килограммах.
public class Ex2_27 {
    static Scanner reader1 = new Scanner(System.in);

    public static void main(String[] args) {
        int a = reader1.nextInt();
        System.out.println("Масса теле в килограммах: " + a/1000 + " кг.");
    }
}

