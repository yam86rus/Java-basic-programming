package Chapter8;

import javafx.scene.transform.Scale;

import java.util.Scanner;

//Задание 8.7
//        Напишите класс, который принимает с клавиатуры два целых положительных
//        числа и затем выводит на экран:
//        • разницу между первым и вторым, - в случае если первое больше
//        второго;
//        • разницу между вторым и первым, - в случае если второе больше
//        первого;
//        • произведение введенных значений, - в случае если они равны.
public class Ex8_7 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первое число");
        int a = reader.nextInt();
        System.out.println("Введите второе число");
        int b = reader.nextInt();
        if (a > b) {
            System.out.println(a - b);
        } else if (a < b) {
            System.out.println(b - a);
        } else {
            System.out.println(a * b);
        }

    }
}
