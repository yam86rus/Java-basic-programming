package Chapter21;

import java.util.Arrays;
import java.util.Scanner;

//Задание 21.18
//        Напишите класс, который принимает с клавиатуры строку, состоящую
//        из букв, цифр и иных символов. Класс должен вывести на экран сумму
//        всех цифр в строке. Например, для ввода alb23c4%&50 класс должен
//        вывести результат 1 +2+3+4+5+0=15.
public class Ex21_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текс");
        String s = scanner.next();
        String s1 = s.replaceAll("\\D", "");
        String[] s2 = s1.split("");
        int[] s3 = new int[s2.length];
        for (int i = 0; i < s2.length; i++) {
            s3[i] = Integer.parseInt(s2[i]);
        }
        System.out.println(Arrays.stream(s3).sum());
    }

}
