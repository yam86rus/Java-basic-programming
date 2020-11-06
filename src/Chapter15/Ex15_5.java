package Chapter15;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//Задание 15.5
//        Напишите класс, который принимает с клавиатуры числа, пока не будет
//        введено значение 999.
//        Класс должен подсчитать, сколько значений было введено с клавиатуры
//        (не считая значения 999), и вывести эту информацию на экран.
public class Ex15_5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int counter = 0;
        int n = 999;
        System.out.println("Введите любое трехзначное число");
        int b = scanner.nextInt();
        while (b != n) {
            b = scanner.nextInt();
            counter++;
        }
        scanner.close();
        System.out.println("Ура!");
        System.out.println("Значение счетчика: " + counter + " раз");
    }
}
