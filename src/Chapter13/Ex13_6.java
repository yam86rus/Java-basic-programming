package Chapter13;

import java.util.Scanner;

//Задание 13.6
//        Определим как «удивительное» целое положительное число Х, для которого
//        выполняется следующее условие: сумма всех целых положительных
//        чисел, меньших Х и являющихся делителями Х, равно Х.
//        Например, число 28 является «удивительным», потому что
//        1+2+4 + 7 + 14 = 28.
//        Напишите класс, который принимает в качестве параметра целое положительное
//        число, проверяет, является ли оно «удивительным», и выводит
//        на экран соответствующее текстовое сообщение.
public class Ex13_6 {
    static String showAmazing(int n) {
        int summa = 0;
        for (int i = n - 1; i >= 1; i--) {
            if (n % i == 0) {
                summa += i;
            }
        }
        String result = (summa == n) ? n + " Удивительное" : n+" Не удивительное";
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int a = scanner.nextInt();
        System.out.println("Число " + showAmazing(a));
    }
}
