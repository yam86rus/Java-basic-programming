package Chapter11;

import java.util.Scanner;

//Задание 11.35
//        81
//        Напишите класс, который принимает с клавиатуры целое число и выводит
//        на экран 25 последующих ему нечетных чисел.
public class Ex11_35 {
    public static void main(String[] args) {
        System.out.println("веедите цело число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 1; i <= 25; ) {
            a++;
            if (a % 2 != 0) {
                System.out.print(a + " ");
                i++;
            }
        }
    }
}
