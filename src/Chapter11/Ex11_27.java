package Chapter11;

import java.util.Scanner;

//Задание 11.27
//        Напишите класс, который принимает с клавиатуры целое положительное
//        число, а затем выводит на экран все целые положительные двузначные
//        числа, сумма цифр которых равна введенному с клавиатуры
//        значению.
public class Ex11_27 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("start");
        int down = 10, up = 99;
        for (int i = 10; i <= 99; i++) {
            if (i / 10 + i % 10 == a) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("finish");
    }
}
