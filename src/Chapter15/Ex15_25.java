package Chapter15;

import java.util.Scanner;

//Задание 15.25
//        Напишите класс, который принимает с клавиатуры целое положительное
//        число и выводит на экран его первую цифру.
//        Например, для числа 7659 на экран будет выведено 7.
public class Ex15_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        String str = "" + ("" + a).charAt(0);
        System.out.println(str);
    }
}
