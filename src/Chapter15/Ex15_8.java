package Chapter15;

import java.util.Scanner;

//Задание 15.8
//        Напишите класс, который принимает с клавиатуры значения, пока их
//        сумма остается меньше 150. По окончании ввода следует вывести на
//        экран информацию о количестве введенных значений и их сумме.
public class Ex15_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int summ = 0;
        int count = 0;
        while (summ < 150) {
            int a = scanner.nextInt();
            summ += a;
            count++;
        }
        System.out.println("Количество введеных значений " + count);
        System.out.println("Сумма " + summ);
    }
}
