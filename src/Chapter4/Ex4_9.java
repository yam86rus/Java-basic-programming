package Chapter4;

import java.util.Scanner;

//Задание 4.9
//        Назовем «весом числа>> сумму его цифр.
//        Напишите класс, который принимает с клавиатуры число (двузначное)
//        и выводит на экран его «вес».
public class Ex4_9 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите двухзначное целое число");
        int a = reader.nextInt();
        int result = a / 10 + a % 10;
        System.out.println(result);
    }

}
