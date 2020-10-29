package Chapter11;

import java.util.Scanner;

//Задание 11.59
//        Напишите класс, который читает два целых положительных числа в
//        переменных А и В и проверяет, действительно ли А меньше, чем В.
//        Если да, - класс должен вывести на экран А последовательных чисел,
//        начиная с числа В, если нет, - класс должен вывести на экран В последовательных
//        чисел, начиная с числа А.
public class Ex11_59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        if (a < b) {
            for (int i = 1; i <= a; i++) {
                System.out.print(b + " ");
                b++;
            }
        }

        if (a > b) {
            for (int i = b; i <= a; i++) {
                System.out.print(i+" ");
            }
        }
    }
}
