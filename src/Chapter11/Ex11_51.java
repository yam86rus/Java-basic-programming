package Chapter11;

import java.util.Scanner;

//Задание 11.51
//        Напишите класс, который принимает с клавиатуры целое положительное
//        число N и выводит на экран серию 1+2+3+ ... +N, то есть серию целых положительных
//        последовательных чисел, начиная с 1 и до введенного с клавиатуры
//        значения (числа при выводе на экран должны разделяться знаком + ).
public class Ex11_51 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            if (i == a) {
                System.out.print(i);
            } else
                System.out.print(i + "+");
        }
    }
}
