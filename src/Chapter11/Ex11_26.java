package Chapter11;

import java.util.Scanner;

//Задание 79
//        Напишите класс, который вначале принимает с клавиатуры целое положительное
//        число (в переменную х). Затем класс выводит на экран в
//        строку все целые числа из диапазона -lxl ... lxl (не включая крайние значения
//        диапазона). Числа должны отделяться друг от друга знаком
//        «пробел». Перед началом и после окончания вывода серии чисел на
//        экран вывода следует вывести текстовые сообщения (по выбору).
public class Ex11_26 {
    public static void main(String[] args) {
        System.out.println("Введите целое положительное число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        a= Math.abs(a);
        System.out.println("Start");
        for (int i=(a*-1)+1;i<=a-1;i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Finish");
    }

}
