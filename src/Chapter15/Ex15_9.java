package Chapter15;

import java.util.Scanner;

//Задание 15.9
//        Напишите класс, который принимает с клавиатуры целое число, а затем выводит на экран последующие
//        ему целые числа, пока сумма этих
//        чисел не превышает квадрата введенного числа.
public class Ex15_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");

        int a = scanner.nextInt();
        int b = a * a;
        for (; a <= b; a++) {
            System.out.print(a + " ");
        }
    }
}
