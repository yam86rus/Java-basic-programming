package Chapter9;

import java.util.Scanner;

//Задание 9.8
//        Назовем билет с шестизначным номером «счастливым», если сумма
//        первых трех его цифр равна сумме последних трех его цифр и обе эти
//        суммы являются четными.
//        Напишите класс, который принимает с клавиатуры шестизначный номер
//        билета и проверяет, является ли он «счастливым» или не является.
public class Ex9_8 {
    static void showInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите шестизначное число, для проверки на 'счастливый' номер");
        int a = scanner.nextInt();
        int n1 = (a / 100_000); // первая цифра
        int n2 = (a / 10_000) % 10; // вторая цифра
        int n3 = (a / 1_000) % 10; // третья цифра
        int n4 = (a % 1000) / 100; //четвертая цифра
        int n5 = (a % 100 / 10); // патая цифра
        int n6 = (a % 10); //шестая цифра
        int summa1 = n1 + n2 + n3;
        int summa2 = n4 + n5 + n6;

        if (summa1 == summa2 && (n1 * 100 + n2 * 10 + n3) % 2 == 0 && (n4 * 100 + n5 * 10 + n6) % 2 == 0) {
            System.out.println("Билет - счастливый");
        } else {
            System.out.println("Билет - обычный");
        }
    }

    public static void main(String[] args) {
        showInfo();
    }
}
