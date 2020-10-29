package Chapter11;

import java.util.Scanner;

//Задание 11.49
//        Напишите класс, который:
//        • сначала вводит с клавиатуры целое положительное двузначное
//        число;
//        • затем выводит на экран (в строку с пробелами) четырехзначные
//        целые положительные числа, в которых предварительно введенное
//        двузначное число является «внутренней» частью (как, например,
//        23 для 1523, или 6237, или 4230).
public class Ex11_49 {
    public static void main(String[] args) {
        System.out.println("Введите целое положительное двухзначное число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n1 = a / 10;
        int n2 = a % 10;

        int p1, p2, p3, p4;
        for (int i = 1000; i <= 9999; i++) {
            p1 = i / 1000;
            p2 = i / 100 % 10;
            p3 = i / 10 % 10;
            p4 = i % 10;

            boolean b1 = (p1 * 10 + p2 == n1 * 10 + n2);
            boolean b2 = (p2 * 10 + p3 == n1 * 10 + n2);
            boolean b3 = (p3 * 10 + p4 == n1 * 10 + n2);
            if (b1 || b2 || b3) {
                System.out.print(i + " ");
            }
        }
    }
}
