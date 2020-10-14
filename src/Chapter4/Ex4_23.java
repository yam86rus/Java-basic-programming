package Chapter4;

import java.util.Scanner;

//Задание 4.2 3
//        Напишите класс, который выполняет «сдвиг вправо по кругу» для четырехзначного
//        числа.
public class Ex4_23 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите целое четырехзначное число");
        int a = scan.nextInt();
        int x1 = a / 1000; // первое число
        int x2 = a / 100 % 10; // второе число
        int x3 = a / 10 % 10; // третье число
        int x4 = a % 10; // четветрое число
        int result = x2 * 1000 + x3 * 100 + x4 * 10 + x1;
        System.out.println(result);

    }
}
