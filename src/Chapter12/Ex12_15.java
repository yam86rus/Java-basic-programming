package Chapter12;

import java.util.Scanner;

//Задание 12.15
//        Напишите класс, который принимает с клавиатуры целое положительное число Х и выводит
//        на экран все его делители (1 и само число Х
//        не считать делителями).
//        Класс должен также подсчитать количество этих делителей и вывести
//        результат на экран вместе с соответствующим по смыслу текстовым
//        сообщением.
public class Ex12_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int x = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (x%i==0) count++;
        }
        System.out.println();
        System.out.println("Количество делителей для числа " + x + " = " + count);
    }
}
