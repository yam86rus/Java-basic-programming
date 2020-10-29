package Chapter11;

import java.util.Scanner;

//Задание 11.30
//        Напишите класс, который вначале принимает с клавиатуры целое положительное
//        число.
//        Затем класс выводит на экран в строку положительные двузначные
//        числа, произведение цифр которых меньше введенного с клавиатуры
//        значения. Числа должны отделяться друг от друга знаком «пробел».
//        Перед началом и после окончания вывода серии чисел на экран вывода
//        следует вывести текстовые сообщения (по выбору).
public class Ex11_30 {
    public static void main(String[] args) {
        System.out.println("Введите целое положительное число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("start");
        for (int i = 10; i<=99;i++ ){
            if((i/10)*(i%10)<a){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("finish");
    }
}
