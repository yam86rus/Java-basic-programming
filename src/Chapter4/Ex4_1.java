package Chapter4;

import java.util.Scanner;

//Задание 4.1
//        Напишите класс, который принимает с клавиатуры целое положительное
//        двузначное число и выводит на экран его цифры, разделенные
//        знаком «пробел».
public class Ex4_1 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите целое положительное двухзначное число");
        int a = reader.nextInt();
        System.out.println(a / 10 + " " + a % 10);
    }
}
