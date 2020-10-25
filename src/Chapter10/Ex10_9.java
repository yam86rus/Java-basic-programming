package Chapter10;

import java.util.Scanner;

//Задание 10.9
//        Напиши класс, представляющий версию игры из предыдущего задания - только в этом случае компьютер должен играть сам с собой, то
//        есть и первое значение должно не вводиться с клавиатуры, а генерироваться классом.
public class Ex10_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int down1 = 0, up1 = 100;
        int a = down1 + (int) ((up1 - down1 + 1) * Math.random()); //генерация первая
        int down = a - 5, up = a + 5;
        int b = down + (int) ((up - down + 1) * Math.random()) ;//вторая генерация в "корридоре" от первого числа
        System.out.println("Компьютер  сгенерировал первое число: " + a);
        System.out.println("Компьютер сгенерировал второе число: " + b);
        if (b > a) {
            System.out.println("Компьютер сгенерировал число большее чем ввел пользователь");
        } else if (b < a) {
            System.out.println("Компьютер сгенерировал число меньшее чем ввел пользователь");
        } else {
            System.out.println("Компьютер сгенерировал число равное тому, что ввел пользователь");
        }
    }
}
