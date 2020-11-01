package Chapter12;

import java.util.Scanner;

//Задание 12.4
//        Напишите класс, который принимает с клавиатуры 17 целых чисел и
//        выводит на экран информацию о том, сколько из них были больше,
//        чем предыдущее число.
public class Ex12_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 17 целых чисел");
        int a = scanner.nextInt();
        int result = 0;
        for (int i = 1; i <= 16; i++) {
            int b = scanner.nextInt();
            if (b>a){
                result++;
                a = b;
            }
        }
        System.out.println("Чисел больше чем предыдущее число " + result);
    }
}
