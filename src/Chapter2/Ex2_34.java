package Chapter2;

import java.util.Scanner;

//Задание 2.34
//Напишите класс, который сначала заносит в переменную строковое
//        значение Привет, а затем принимает с клавиатуры ваше имя.
//        Класс должен вывести на экран в одной строке сообщение, составленное
//        из строкового значения Привет, знака «запятая» и вашего имени.
public class Ex2_34 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        String s = "Привет";
        System.out.println("Введите ваше имя");
        String myName = reader.next();
        System.out.println("" + s + ", " + myName);
    }
}
