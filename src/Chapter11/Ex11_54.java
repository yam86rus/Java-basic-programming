package Chapter11;

import java.util.Scanner;

//Задание 11.54
//        Напишите класс, который принимает с клавиатуры два целых положительных
//        числа: N и М (неизвестно, какое из введенных чисел больше).
//        Класс должен вывести на экран все целые числа между наименьшим и
//        наибольшим значениями, введенными с клавиатуры.
public class Ex11_54 {
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
            System.out.print(min + " ");

        }
    }
}
