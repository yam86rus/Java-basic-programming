package Chapter4;

import java.util.Scanner;

//Задание 4.12
//        Назовем «длиной трехзначного числа» разницу между его первой (число
//        сотен) и последней (число единиц) цифрами, умноженную на его
//        среднюю (число десятков) цифру.
//        Напишите класс, который принимает с клавиатуры целое положительное
//        трехзначное число, вычисляет его «длину» и выводит результат на
//        экран.
public class Ex4_12 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите трехзначное целое число");
        int a = reader.nextInt();
        int result = (a / 100 - a % 10) * (a / 10 % 10);
        System.out.println(result);
    }
}
