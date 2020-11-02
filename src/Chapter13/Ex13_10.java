package Chapter13;

import java.util.Scanner;

//Задание 13.10
//        Назовем «степенью близости» двух целых положительных чисел сумму
//        их общих делителей.
//        Напишите класс, который принимает с клавиатуры два целых положительных
//        числа и определяет их «степень близости».
public class Ex13_10 {
    int summa(int a) {
        int summa = 0;
        for (int i = a; i >= 1; i--) {
            if (a % i == 0) {
                summa += i;
            }
        }
        return summa;
    }

    int showInfo(int a, int b) {
        int result = summa(a) + summa(b);
        return result;
    }

    public static void main(String[] args) {
        Ex13_10 test1 = new Ex13_10();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int result = test1.showInfo(a,b);
        System.out.println("Степень близости = " + result);
    }
}
