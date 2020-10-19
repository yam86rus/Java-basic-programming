package Chapter8;

import java.util.Scanner;

//Задание 8.20
//        Напишите класс, который принимает с клавиатуры трехзначное положительное
//        число и проверяет, содержится ли в нем хотя бы один ноль.
//        По результатам проверки надо вывести на экран соответствующее текстовое
//        сообщение.
public class Ex8_20 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите трехзначное положительное число");
        int a = reader.nextInt();
        String result = a / 100 == 0 || a / 10 % 10 == 0 || a % 10 == 0 ? "В числе есть ноль" : "В числе нет нуля";
        System.out.println(result);
    }
}
