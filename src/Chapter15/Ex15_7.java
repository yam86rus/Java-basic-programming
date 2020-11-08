package Chapter15;

import java.util.Scanner;

//Задание 15.7
//        Напишите класс, который должен принять с клавиатуры значение 123
//        и вывести на экран сообщение Код принят.
//        Класс будет снова и снова принимать с клавиатуры значения до тех
//        пор, пока не будет введено значение 123. На каждое вводимое с клавиатуры значение, отличное от 123, класс должен выводить сообщение
//        Код неверный, повторите ввод.
public class Ex15_7 {
    public static void main(String[] args) {
        int code = 123;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите код");
        while (true) {
            int a = scanner.nextInt();
            if (a == code) break;
            else System.out.println("Код неверный");
        }
        System.out.println("Код принят");
    }
}
