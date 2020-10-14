package Chapter4;

import java.util.Scanner;

//Задание 4.13
//        Назовем «степенью четности» числа количество четных цифр в нем. Например,
//        для числа 4612 степень четности равна 3 (в его составе три четных
//        цифры - 4, 6 и 2).Напишите класс, который принимает с клавиатуры положительное
//двузначное число, а затем вычисляет и выводит на экран его «степень
//четности».
public class Ex4_13 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите целое двухзначное число");
        int a = reader.nextInt();
        int x1 = a / 10;
        int x2 = a % 10;
        int result = 2 + ((x1 % 2) * -1 + (x2 % 2) * -1);
        System.out.println(result);

    }
}
