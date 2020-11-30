package Chapter16;

import java.util.Scanner;

//Задание 16.9
//        Напишите класс для графического изображения делимости чисел
//        от 1 до n (значение переменной n вводится с клавиатуры). В каждой
//        строке надо вывести число и столько плюсов, сколько делителей у этого
//        числа (считая и единицу, и само число). Например, если исходное
//        данное - число 4, то на экран должно быть выведено:
//        1+
//        2++
//        3++
//        4+++
public class Ex16_9 {
    static void foo(int n) {
        int count = 0;
        StringBuilder result = new StringBuilder();
        for (int j = 1; j <= n; j++) {
            if (n % j == 0) {
                result.append("+");
            }
        }
        System.out.println(n + " " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            foo(i);
        }
    }
}
