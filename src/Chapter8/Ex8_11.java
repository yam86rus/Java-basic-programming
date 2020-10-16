package Chapter8;

import java.util.Scanner;

//Задание 8.11
//Напишите класс, который принимает с клавиатуры два числа: первое -
//        количество учеников в классе, второе - количество стульев в классной
//        комнате.
//        Программа проверит соответствие между этими двумя значениями и
//        выведет на экран соответствующую информацию (например, для значений
//        35 и 39 на экран выводится 4 стула лишних).
public class Ex8_11 {
    static Scanner scaner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите количество учеников в классе");
        int students = scaner.nextInt();
        System.out.println("Введите количество стульев в классе");
        int chairs = scaner.nextInt();

        if (chairs > students) {
            System.out.println("лишних стульев: " + (chairs - students));
        } else if (students == chairs) {
            System.out.println("Всем хватило стульев, лишних не осталось.");
        } else {
            System.out.println("Не хватило стульев: " + (chairs - students));
        }
    }
}
