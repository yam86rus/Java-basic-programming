package Chapter13;

import java.util.Scanner;

//Задание 13.15
//        Напишите класс, который принимает с клавиатуры двузначное положительное
//        целое число Х, составленное из разных цифр, и возвращает
//        сумму однозначных чисел, заключенных между цифрами этого числа Х
//        (включая сами цифры, из которых составлено число Х).
//        Например, и для числа 52, и для числа 25 будет возвращено значение
//        14 (2 + 3 + 4 + 5 = 14).
public class Ex13_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int a = scanner.nextInt();
        int n1 = a / 10;
        int n2 = a % 10;
        int min = 0;
        int max = 0;

        if (n1 < n2) {
            min = n1;
            max = n2;
        } else {
            min = n2;
            max = n1;
        }
        int result = 0;
        for (int i = min; i <= max; i++) {
            if (i == max) {
                System.out.print(i);
                result += i;
            } else {
                System.out.print(i + "+");
                result += i;
            }
        }
        System.out.print("=" + result);
    }
}
