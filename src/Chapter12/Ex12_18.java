package Chapter12;

import java.util.Scanner;

//Задание 12.18
//        Назовем «степенью родства» двух целых положительных чисел количество
//        их общих делителей.
//        Напишите класс, который принимает с клавиатуры два целых положительных
//        числа и определяет их «степень родства».
public class Ex12_18 {
    static int showInfo(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) result++;
        }
        return result;
    }

    static int cheker(int a, int b) {
        int n1 = showInfo(a);
        int n2 = showInfo(b);
        int result = 0;
        if (n1 < n2) result = n1;
        else result = n2;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе целое число");
        int b = scanner.nextInt();
        System.out.println("Степень родства " + cheker(a, b));


    }
}
