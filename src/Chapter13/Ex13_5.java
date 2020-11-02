package Chapter13;

import java.util.Scanner;

//Задание 13.5
//        Назовем «базой» положительного числа Х сумму всех положительных
//        целых чисел, меньших Х.
//        Напишите класс, который принимает с клавиатуры положительное
//        целое число Х и подсчитывает его «базу».
public class Ex13_5 {
    static int countBase(int n) {
        int result = 0;
        for (int i = n-1; i >= 1; i--) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int a = scanner.nextInt();
        System.out.println("База числа " + a + " = " + countBase(a));
    }
}
