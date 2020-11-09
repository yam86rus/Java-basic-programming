package Chapter15;

import java.util.Scanner;

//Задание 15.13
//        Напишите класс, который должен принимать с клавиатуры серию возрастающих
//        по значению целых чисел.
//        Класс должен выводить на экран количество значений в серии - за
//        исключением последнего введенного с клавиатуры значения.
public class Ex15_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int count = 0;
        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a >= b) break;
        }
        System.out.println(count++);
    }
}
