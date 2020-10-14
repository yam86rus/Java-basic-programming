package Chapter4;

import java.util.Scanner;

//Задание 4.26
//        Назовем «большим обменом» операцию, при которой два числа «обмениваются
//        » своими левыми цифрами.
//        1. Напишите класс, который принимает с клавиатуры два трехзначных
//        положительных числа и совершает над ними операцию «обмена».
//        2. Возможно ли совершить операцию «большого обмена», если два
//        числа имеют разное количество цифр? Обоснуйте свой ответ.
public class Ex4_26 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первое трехзначное число");
        int a = reader.nextInt();
        System.out.println("Введите второе трехзначное число");
        int b = reader.nextInt();
        int a1 = b / 100 * 100 + (a / 10 % 10) * 10 + a % 10;
        int b1 = a / 100 * 100 + (b / 10 % 10) * 10 + a % 10;
        System.out.println("Старое " + a + " Новое: " + a1);
        System.out.println("Старое " + b + " Новое: " + b1);
    }
}
