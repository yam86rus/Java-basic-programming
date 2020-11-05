package Chapter14;

import java.util.Scanner;

//Задание 14.6
//        Напишите класс, который принимает с клавиатуры серию из 27 целых
//        чисел и сравнивает два значения: среднее арифметическое максимума
//        и минимума, и среднее арифметическое всех значений серии.
public class Ex14_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        double a = scanner.nextInt();
        double max = a, min = a;
        double avr = a;

        for (int i = 2; i <= 5; i++) {
            double b = scanner.nextInt();
            if (b>max) max = b;
            if (b<min) min = b;
            avr += b;
        }
        System.out.println("Среднее арифметическое от максимального числа " + max/5);
        System.out.println("Среднее арифметическое от минимального числа  " + min/5);
        System.out.println("Среднее арифметическое " + avr/5);
        scanner.close();

    }
}
