package Chapter8;

import java.util.Scanner;

//Задание 8.14
//        Напишите класс, который принимает с клавиатуры двузначное положительное
//        число и проверяет, является ли в нем первая цифра (десятков)
//        больше второй (единиц). В соответствии с результатом проверки
//        надо вывести на экран соответствующее текстовое сообщение.
public class Ex8_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное двухзначное число");
        int number = scanner.nextInt();
        if (number / 10 > number % 10) {
            System.out.println("Число десятков больше единиц");
        } else if (number / 10 < number % 10){
            System.out.println("Число десятков меньше единиц");
        } else {
            System.out.println("Число десятков и единиц - совпадают");
        }
    }
}

