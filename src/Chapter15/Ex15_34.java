package Chapter15;

import java.util.Scanner;

//Задание 15.34
//        Напишите класс, который принимает с клавиатуры целое положительное
//        число х. Класс должен определить наибольшее значение в серии
//        12+22+32+ .. " сумма которой не превышает х.
public class Ex15_34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int x = scanner.nextInt();
        int summ = 12;
        while (summ < x) {
            summ +=10;
        }
    }
}
