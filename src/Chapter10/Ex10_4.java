package Chapter10;

import java.util.Scanner;

//Задание 10.4
//        Напишите класс, который принимает с клавиатуры целое положительное
//        число, а затем генерирует три целых положительных числа, меньших
//        первого.
public class Ex10_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int a = scanner.nextInt();
        int down = -10, up = a;
        int n1 = down + (int)((up-down+1)*Math.random());
        int n2 = down + (int)((up-down+1)*Math.random());
        int n3 = down + (int)((up-down+1)*Math.random());
        System.out.println("Число введенное пользователем: " + a);
        System.out.println("Три случайно сгенерированные числа, меньшие чем ввел пользователь:");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

    }
}
