package Chapter15;

import java.util.Scanner;

//Задание 15.29
//        Напишите класс, который принимает с клавиатуры целое число и подсчитывает
//        сумму его цифр.
//        Результат подсчета должен быть выведен на экран. Например, для числа
//        534 на экран будет выведено 12.
public class Ex15_29 {
    static int summ(int a) {
        int result = 0;
        while (a > 0) {
            result+=a%10;
            a /= 10;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int a = scanner.nextInt();
        System.out.println("В числе " +a + " цифр: " + summ(a));
    }
}
