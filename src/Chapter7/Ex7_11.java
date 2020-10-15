package Chapter7;

import java.util.Scanner;

//Задание 7.11
//        Напишите класс, который принимает с клавиатуры два различных числа.
//        Класс должен вывести на экран эти числа в порядке возрастания -
//        в одной строке, а в другой - их же, но в порядке убывания.
public class Ex7_11 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первое число");
        int a = reader.nextInt();
        System.out.println("Введите второе число");
        int b = reader.nextInt();
        if (a > b) {
            System.out.println(b + " " + a);
            System.out.println(a + " " + b);
        } else if (a < b) {
            System.out.println(a + " " + b);
            System.out.println(b + " " + a);
        } else {
            System.out.println("Числа одинаковые");
        }
    }
}
