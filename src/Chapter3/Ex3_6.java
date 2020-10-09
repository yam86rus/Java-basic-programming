package Chapter3;

import java.util.Scanner;

//Задание 3.6
//        Напишите класс, который принимает с клавиатуры целое число и выводит
//        на экран (в одной строке) три следующих за ним целых числа так,
//        чтобы разница между каждым числом и следующим за ним составляла 2.
//        Например: для введенного с клавиатуры числа 6 надо вывести на экран
//        числа 8, 10, 12.
public class Ex3_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = scan.nextInt();
        System.out.println((a + 2) + " " + (a + 4) + " " + (a + 6));
    }
}
