package Chapter8;

import java.util.Scanner;

//Задание 8.22
//        Напишите класс, который принимает с клавиатуры целое положительное
//        число и изменяет его следующим образом:
//        • для четного числа - увеличивает его до ближайшего «крутлого» и
//        выводит новое значение на экран вместе с сообщением Up to."
//        • для нечетного числа - уменьшает его до ближайшего «крутлого» и
//        выводит новое значение на экран вместе с сообщением Down to".
//        Например, для введенного значения 433 на экран выводится Down to
//        430, а для 56 выводится Up to 60.
public class Ex8_22 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите целое положительное число");
        int a = reader.nextInt();
        if (a % 2 == 0) {
            int b = a / 10 * 10 + 10;
            System.out.println("Up to " + b);
        } else {
            int b = a / 10 * 10;
            System.out.println("Down to " + b);
        }
    }
}
