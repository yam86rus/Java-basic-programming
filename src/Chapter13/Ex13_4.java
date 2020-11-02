package Chapter13;

import java.util.Scanner;

//Задание 13.4
//        Напишите класс, который принимает с клавиатуры положительное
//        целое число и выводит на экран все его делители.
//        Кроме того, класс должен определять количество и сумму делителей и
//        выводить результаты на экран.
public class Ex13_4 {
    static void showInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int a = scanner.nextInt();
        int count1 = 0;//количество делителей
        int summ = 0; // сумма делителей
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.print(i + " ");
                count1++;
                summ += i;
            }
        }
        System.out.println();
        System.out.println("Количество делителей = " + count1);
        System.out.println("Сумма делителей = " + summ);
    }

    public static void main(String[] args) {
        showInfo();
    }
}
