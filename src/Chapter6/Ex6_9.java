package Chapter6;

import java.util.Scanner;

//Задание 6.9
//        Трехзначное положительное число называется «четно-красивым», если
//        каждая из его цифр - четная. Напишите класс, который принимает с
//        клавиатуры трехзначное число и проверяет, является ли оно «четнокрасивым
//        ». В соответствии с результатом проверки надо вывести на
//        экран соответствующее текстовое сообщение.
//        Обратите внимание: задание имеет решение с использованием одного
//        оператора if и без составного условия!
public class Ex6_9 {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите любое любое положительное трехзначное число");
        int number = reader.nextInt();
        int n1 = (int) (number / 100); // первая цифра
        int n2 = (int) ((number - (n1 * 100)) / 10); // вторая цифры
        int n3 = number % 10; // третья цифра
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        if (n1 %2 == 0 & n2 % 2 == 0 & n3 % 2 == 0){
            System.out.println("Четнокрасивое");
        }


    }
}
