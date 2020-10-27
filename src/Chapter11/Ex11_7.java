package Chapter11;

import java.util.Scanner;

//Задание 11.7
//        Напишите вариант предыдущей задачи, исходя из того, что неизвестно,
//        какое из вводимых с клавиатуры значений больше, а какое - меньше.
public class Ex11_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое положительное число");
        int a = scanner.nextInt();
        System.out.println("Введите второе положительное число, больше первого");
        int b = scanner.nextInt();
        int down = 0, up = 0;
        if (a < b) {
            down = a;
            up = b;
        }
        if (a > b) {
            up = a;
            down = b;
        }
        if (a == b) {
            up = a;
            down = b;
        }


        for (int i = 1; i <= 20; i++) {
            int random = down + (int) ((up - down + 1) * Math.random());
            System.out.println("Cлучайное число в диапозоне от " + down + " до " + up + "  :  " + random);
        }
    }
}
