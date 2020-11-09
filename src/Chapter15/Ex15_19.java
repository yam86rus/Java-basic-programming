package Chapter15;

import java.util.Scanner;

//Задание 15.19
//        Напишите класс, который вводит с клавиатуры 15 целых положительных
//        чисел, для каждого введенного числа класс напечатает сумму его
//        цифр.
public class Ex15_19 {
    static int summ(int a) {
        int result = 0;
        while (a > 0) {
            result += a % 10;
            a /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 15; i++) {
            int a = scanner.nextInt();
            System.out.println(summ(a));
        }
    }
}
