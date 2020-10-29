package Chapter11;

import java.util.Scanner;

//Задание 11.57
//        Напишите класс, который принимает с клавиатуры целое число а,
//        а затем выводит на экран серию из 15 целых чисел, начиная с 1 так, что
//        каждое следующее число в серии на а больше предыдущего числа (между
//        числами должен быть знак#): l#l +a#l +2а# ...
public class Ex11_57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = scanner.nextInt();
        System.out.print(1+"#");
        for (int i = 1; i <= 15; i++) {
            System.out.print(i*a + "#");
        }
    }
}
