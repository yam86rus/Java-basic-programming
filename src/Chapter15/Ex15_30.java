package Chapter15;

import java.util.Scanner;

//Задание 15.30
//        Напишите класс, который принимает с клавиатуры целое число и подсчитывает
//        количество нулей в этом числе.
//        Результат подсчета надо вывести на экран.
public class Ex15_30 {
    static int summ(int a) {
        int counter = 0;
        while (a > 0) {
            if (a%10 == 0) {
                counter++;
            }
            a /= 10;
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int a = scanner.nextInt();
        System.out.println("В числе " + a + " нулей " + summ(a));
    }
}
