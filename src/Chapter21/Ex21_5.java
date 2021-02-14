package Chapter21;

import java.util.Scanner;

//Задание 21.5
//        Напишите класс, который принимает с клавиатуры фамилию человека,
//        а затем выводит ее на экран, добавив знак «пробел» между буквами.
public class Ex21_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию");
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
    }
}
