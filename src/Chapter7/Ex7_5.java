package Chapter7;

import java.util.Scanner;

//Задание 7.5
//        Напишите класс, который принимает с клавиатуры целое число и определяет,
//        является оно положительным или нет, и выводит на экран одно из двух соответствующих результатам проверки сообщений: Положительное
//        число и Не положительное число.
public class Ex7_5 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите целое число");
        int a = reader.nextInt();
        String result = a >= 0 ? "Положительное" : "Не положительное";
        System.out.println(result);
    }
}
