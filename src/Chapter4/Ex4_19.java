package Chapter4;

import java.util.Scanner;

//Задание 4.19
//        Напишите класс, который выполняет «линейный сдвиг влево» для четырехзначного
//        числа.
public class Ex4_19 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите целое трехзначное число");
        int a = reader.nextInt();
        int x1 = a / 1000; //первое число
        int x2 = a / 100 % 10; //второе число
        int x3 = a / 10 % 10; //третье число
        int x4 = a % 10; //четвертое число
        int result = x2 * 1000 + x3 * 100 + x4 * 10;
        System.out.println(result);

    }
}
