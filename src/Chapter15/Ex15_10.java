package Chapter15;

import java.util.Scanner;

//Задание 15.10
//        Напишите класс, который принимает с клавиатуры число для переменной Х, а затем дополнительную
//        серию чисел, каждое из которых
//        используется для уменьшения значения переменной Х. Ввод чисел
//        должен производиться до тех пор, пока значение переменной Х остается положительным.
public class Ex15_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int x = scanner.nextInt();
        System.out.println("А теперь вводите числа, которые будут вычитаться из первого числа");
        while (x >= 0) {
            int a = scanner.nextInt();
            x -= a;
        }
    }
}
