package Chapter4;

import java.util.Scanner;

//Задание 4.21
//        Напишите класс, который выполняет «сдвиг влево по кругу» для четырехзначного
//        числа.
public class Ex4_21 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите целое четырехзначное число");
        int x1, x2, x3, x4, result, a = reader.nextInt();
        x1 = a / 1000; // первая цифра
        x2 = a / 100 % 10; // вторая цифра
        x3 = a / 10 % 10; // третья цифра
        x4 = a % 10; // четвертая цифра
        result = x2 * 1000 + x3 * 100 + x4 * 10 + x1;
        System.out.println(result);
    }
}
