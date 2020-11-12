package Chapter15;

import java.util.Scanner;

//Задание 15.35
//        Напишите класс, который принимает с клавиатуры целое положительное
//        число и строит из него число с обратным порядком цифр.
//        Новое значение следует вывести на экран.
public class Ex15_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int x = scanner.nextInt();
        String x1 = new StringBuilder("" + x).reverse().toString();
        System.out.println(x1);
    }
}
