package Chapter15;

import java.util.Scanner;

//Задание 15.28
//        Напишите класс, который принимает с клавиатуры целое число и подсчитывает
//        число цифр в нем (количество цифр в числе).
//        Результат подсчета должен быть выведен на экран. Например, для числа
//        534 на экран будет выведено 3 цифры.
public class Ex15_28 {
    static int summ(int a) {
        int result = 0;
        while (a > 0) {
            result++;
            a /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int a = scanner.nextInt();
        System.out.println("В числе " +a + " цифр: " + summ(a) + " штук");
    }
}
