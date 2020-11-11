package Chapter15;

import java.util.Scanner;

//Задание 15.23
//        Напишите класс, который принимает с клавиатуры целое число и выводит
//        на экран:
//        • в первой строке - все четные (по значению) цифры этого числа,
//        через пробел;
//        • во второй строке - все нечетные (по значению) цифры этого числа,
//        через пробел.
//        Например, для числа 765873 в первой строке будет выведена серия 6 8,
//        а во второй строке - 7 5 7 3.
public class Ex15_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = scanner.nextInt();
        StringBuilder st = new StringBuilder(); // четные числа
        StringBuilder st1 = new StringBuilder(); // нечетные
        while (a > 0) {
            if (a % 2 == 0) st.append(a % 10+" ");
            else st1.append(a % 10+ " ");
            a /= 10;
        }
        System.out.println(st.reverse().toString().trim());
        System.out.println(st1.reverse().toString().trim());
    }
}
