package Chapter6;

import java.util.Scanner;

//Задание 6.12
//        Напишите класс, который принимает с клавиатуры три значения (а, Ь
//        и с), являющиеся коэффициентами квадратного уравнения.
//        Класс должен определить, имеется ли у этого уравнения хотя бы один
//        корень (решение), и вывести на экран соответствующее текстовое сообщение.
public class Ex6_12 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите значение a");
        int a = reader.nextInt();
        System.out.println("Введите значение b");
        int b = reader.nextInt();
        System.out.println("Введите значение c");
        int c = reader.nextInt();
        int d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("Да");
        } else {
            System.out.println("нет");
        }
    }
}
