package Chapter21;

import java.util.Scanner;

//Задание 21.16
//        Напишите класс, который принимает с клавиатуры серию строковых
//        значений. Ввод значений прекращается, когда очередным значением
//        будет Финиш.
//        Класс должен определить, какое количество значений в серии были
//        палиндромами.
public class Ex21_16 {
    static boolean isPalindrom(String str) {
        String str2 = new StringBuilder(str).reverse().toString();
        if (str.equals(str2)) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("До тех пор, пока не будет введено значение \"Финиш\", будет происходит чтение из консоли");
        int result = 0;
        while (true) {
            String s = scanner.next();
            if (isPalindrom(s)) {
                result++;
            }
            if (s.equals("Финиш")) {
                break;
            }
        }
        System.out.println("Колличество насчитанных палиндромов = " + result);


    }
}
