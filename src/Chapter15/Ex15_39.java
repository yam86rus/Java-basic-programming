package Chapter15;

import java.util.Scanner;

//Задание 15.39
//        Напишите класс, который принимает с клавиатуры целое положительное число и
//        находит его наименьший делитель, отличный от 1.
public class Ex15_39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        double a = scanner.nextInt();
        double b = a;
        double d = 0;
        while (b > 0) {
            System.out.print(a /b + " ");
            b--;
        }
    }
}
// 25 24 23 22 .... 3 2 1