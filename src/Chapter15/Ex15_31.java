package Chapter15;

import java.util.Scanner;

//Задание 15.31
//        Напишите класс, который принимает с клавиатуры серию целых чисел
//        до тех пор, пока количество четных чисел в серии остается меньше 5.
public class Ex15_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int a = scanner.nextInt();
        int seria = 0;
        while (seria < 5) {
            int b = scanner.nextInt();
            if (b % 2 == 0) {
                seria++;
            }
        }

    }
}
