package Chapter11;

import java.util.Scanner;

//Задание 11.53
//        Напишите класс, который принимает с клавиатуры два целых положительных
//        числа: N и М (можно считать, что M<N).
//        Класс должен вывести на экран серию М+(М+ 1)+(М+2)+ ... +N.
public class Ex11_53 {
    public static void main(String[] args) {
        System.out.println("Введите первое число. целое положительное");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println("Введите второе число. целое положительное больше первого");
        int n = scanner.nextInt();
        for (; m <= n; m++) {
            if (m == n) {
                System.out.println(m);
            } else
                System.out.print(m + "+");
        }
    }
}
