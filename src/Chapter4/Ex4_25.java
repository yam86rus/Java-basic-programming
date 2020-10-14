package Chapter4;

import java.util.Scanner;

//Задание 4.25
//        Назовем «обменом» операцию, при которой два числа «обмениваются»
//        своими правыми цифрами.
//        Напишите класс, который принимает с клавиатуры два положительных
//        числа и совершает над ними операцию "обмена". Числа могут быть разной длинны.
public class Ex4_25 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первое число");
        int a = reader.nextInt();
        System.out.println("Введите второе число");
        int b = reader.nextInt();
        int firstNumber = a / 10 * 10 + b % 10;
        int secondNumber = b / 10 * 10 + a % 10;
        System.out.println("Первое число было: " + a + " а теперь стало: " + firstNumber);
        System.out.println("Второе число было: " + b + " а теперь стало: " + secondNumber);
    }

}
