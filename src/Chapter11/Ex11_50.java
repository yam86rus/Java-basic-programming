package Chapter11;
//Задание 11.50
//        Напишите класс, который:
//        • сначала вводит с клавиатуры целое положительное двузначное
//        число (нет необходимости проверять соответствие введенного
//        значения этому условию);
//        • затем выводит на экран четырехзначные целые положительные
//        числа, в которых и сумма двух первых цифр, и сумма двух последних
//        цифр равны сумме цифр двузначного числа, введенного с
//        клавиатуры.

import java.util.Scanner;

public class Ex11_50 {
    public static void main(String[] args) {
        System.out.println("Введите целое двухзначное число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int summa = a / 10 + a % 10;
        for (int i = 1000; i <= 9999; i++) {
            int summaLeft = i / 1000 + i / 100 % 10;
            int summaRight = i / 10 % 10 + i % 10;
            if (summa == summaLeft || summa == summaRight) {
                System.out.print(i + " ");
            }
        }
    }
}
