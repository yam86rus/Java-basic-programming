package Chapter11;

import java.util.Scanner;

//Задание 11.36
//        Напишите класс, который принимает с клавиатуры целое число и выводит
//        на экран 10 предшествующих ему чисел, причем разница между
//        значениями этих чисел должна быть равна 6.
public class Ex11_36 {
    public static void main(String[] args) {
        System.out.println("веедите цело число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.print((a - (i * 6)) + " ");
        }
    }
}
