package Chapter8;

import java.util.Scanner;

//Задание 8.21
//        Напишите класс, который принимает с клавиатуры положительное
//        целое число и выводит на экран ближайшее к нему «крутлое число».
//        Например, для введенного значения 433 выводится на экран 430, а для
//        56 выводится 60.
public class Ex8_21 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите положительное число");
        int a = scanner.nextInt();
        if (a % 10 < 5) {
            System.out.println(a / 10 * 10);
        } else {
            System.out.println(a / 10 * 10 + 10);
        }
    }
}
