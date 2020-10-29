package Chapter11;

import java.util.Scanner;

//Задание 11.60
//        Напишите класс, который принимает с клавиатуры целое число N,
//        а затем выводит на экран все степени двойки от 1 до N включительно.
public class Ex11_60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.println("два в степени " + i + " = " + (int)Math.pow(2, i));
        }
    }
}
