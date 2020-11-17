package Chapter15;

import java.util.Scanner;

//Задание 15.42
//        Последовательность Фибоначчи определяется как серия чисел, в которой первый и второй члены равны 1, а любой член, начиная с третьего,
//        равен сумме двух предыдущих членов.
//        Напишите класс, который принимает с клавиатуры целое положительное число и проверяет, является ли оно членом последовательности
//        Фибоначчи.
public class Ex15_42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для проверки");
        int a = scanner.nextInt();
        int n1 = 1, n2 = 1;
        int n3 = n1 + n2;
        if (a == 1) {
            System.out.println("Число является членом последовательностью фибоначи");
        } else {
            while (a > n3) {
                n1 = n2;
                n2 = n3;
                n3 = n1 + n2;
                System.out.print(n3 + " ");
            }
        }
    }
}
//1 1 2 3 5