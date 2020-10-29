package Chapter11;

import java.util.Scanner;

//Задание 11.55
//        Напишите класс, который принимает с клавиатуры два целых положительных
//        числа: N и М (неизвестно, какое из введенных чисел больше).
//        Класс должен вывести на экран все четные числа между наименьшим и
//        наибольшим значениями, введенными с клавиатуры.
public class Ex11_55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int max , min;
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        for (; min <= max; min++) {
            if (min%2==0)
            System.out.print(min + " ");

        }
    }
}
