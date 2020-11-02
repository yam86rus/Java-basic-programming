package Chapter13;

import java.util.Scanner;

//Задание 13.8
//        Назовем «дважды делимым» целое положительное число, если и оно
//        само, и сумма его делителей - делятся (без остатка, разумеется) на
//        количество делителей числа.
//        Напишите класс, который принимает с клавиатуры целое положительное
//        число и проверяет, является ли оно· «дважды делимым».
public class Ex13_8 {
    static boolean showInfo() {
        boolean result = false;
        System.out.println("Введите целое положительное число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int summa = 0;
        int counter = 0;
        for (int i = a; i >= 1; i--) {
            if (a % i == 0) {
                summa += i;
                counter++;
            }
        }
        if (a % counter == 0 && summa % counter == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        String answer = showInfo() ? "Дважды делимое" : "Не дважды делимое";
        System.out.println(answer);
    }
}
