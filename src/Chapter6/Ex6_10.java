package Chapter6;

import java.util.Scanner;

//Задание 6.10
//        Напишите программу (класс), которая принимает с клавиатуры двузначное
//        число и проверяет, что больше: само это число или произведение
//        его цифр.
public class Ex6_10 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите двухзначное число");
        int n = reader.nextInt();
        int n1 = n / 10;
        int n2 = n % 10;

        if ((n1 * n2) > n) {
            System.out.println("Произведение цифр двухзначного числа " + n + " больше чем само число " + n);
        } else if (((n1 * n2) < n)) {
            System.out.println("Произведение цифр двухзначного числа " + n + " меньше чем само число " + n);

        }
    }

}
