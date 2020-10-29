package Chapter11;

import java.util.Scanner;

//Задание 11.48
//        Напишите класс, который:
//        • сначала вводит с клавиатуры целое положительное двузначное
//        число;
//        • затем выводит на экран (в строку с пробелами) трехзначные целые
//        положительные числа, в которых предварительно введенное
//        двузначное число является «внутренней» частью (как, например,
//        23 для 123 или 623).
public class Ex11_48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите положительное двухзначное число");
        int a = scanner.nextInt();
        int n1, n2, n3;
        for (int i = 100; i <= 999; i++) {
            n1 = i / 100;
            n2 = i / 10 % 10;
            n3 = i % 10;
            if (a == (n1 * 10 + n2) || a == (n2 * 10 + n3)) {
                System.out.print(i + " ");
            }
        }
    }

}
