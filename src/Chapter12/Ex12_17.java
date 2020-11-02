package Chapter12;

import java.util.Scanner;

//Задание 12.17
//        Два положительных целых числа называются «родственными», если у
//        них есть одинаковое количество делителей.
//        Напишите класс, который принимает с клавиатуры два целых положительных
//        числа и проверяет, являются ли они «родственными».
public class Ex12_17 {
    static int showInfo(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) result++;
        }
        return result;
    }

    static String cheker(int a, int b) {
        int n1 = showInfo(a);
        int n2 = showInfo(b);
        String result = (n1 == n2) ? "родственные" : "не родственные";
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе целое число");
        int b = scanner.nextInt();
        System.out.println(cheker(a, b));

    }
}
