package Chapter11;

import java.util.Scanner;

//Задание 11.34
//        Напишите класс, который принимает с клавиатуры целое число и выводит
//        на экран 18 последующих ему чисел.
public class Ex11_34 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = a+1; i <= a + 18; i++) {
            System.out.print(i + " ");
        }
    }
}
