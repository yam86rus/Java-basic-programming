package Chapter4;

import java.util.Scanner;

//Задание 4.18
//        Назовем «линейным сдвигом числа влево» операцию, при которой его
//        цифры перемещаются на одну позицию влево (единицы - на место
//        десятков, десятки - на место сотен, сотни - на место тысяч и так далее)
//        - при этом первая цифра удаляется из числа, а на место единиц
//        записывается ноль.
//        Например, из числа 1234 после такой операции получается число 2340.
//        Напишите класс, который принимает с клавиатуры трехзначное число
//        и строит новое число, полученное «линейным сдвигом влево».
public class Ex4_18 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите целое трехзначное число");
        int a = reader.nextInt();
        int x1 = a / 100; //первое число
        int x2 = a / 10 % 10; //второе число
        int x3 = a % 10; //третье число
        int result = x2 * 100 + x3 * 10;
        System.out.println(result);

    }
}
