package Chapter15;

import java.util.Scanner;

//Задание 15.6
//        Напишите класс, который принимает с клавиатуры числа, пока небудет
//        введено значение 999.
//        Класс должен подсчитать, сколько значений было введено с клавиатуры,
//        чему равна сумма этих значений (не считая значения 999), и вывести
//        эту информацию на экран.
public class Ex15_6 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int counter = 0;
        int n = 999;
        System.out.println("Введите любое трехзначное число");
        int b = scanner.nextInt();
        int summ = 0;
        while (b != n) {
            b = scanner.nextInt();
            summ += b;
            counter++;
        }
        scanner.close();
        System.out.println("Ура!");
        System.out.println("Значение счетчика: " + counter + " раз");
        System.out.println("Сумма: " + (summ - 999));
    }
}
