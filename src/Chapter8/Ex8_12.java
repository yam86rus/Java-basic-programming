package Chapter8;

import java.util.Scanner;

//Задание 8.12
//        Напишите класс, который принимает с клавиатуры оценку ученика
//        (целое число) и проверяет, не является ли введенное значение ошибочным.
//        На экран должно выводиться соответствующее текстовое сообщение.
public class Ex8_12 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите оценку ученика");
        int a = reader.nextInt();
        String result = a>0 && a<6 ? "оценка в пределах": "не существующая оценка";
        System.out.println(result);
    }
}
