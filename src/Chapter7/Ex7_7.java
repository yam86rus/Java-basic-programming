package Chapter7;

import java.util.Scanner;

//Задание 7.7
//        Напишите класс, который принимает с клавиатуры два числа, первое
//        из которых - количество учеников в классе, а второе - количество
//        стульев в классной комнате. Программа должна проверить, всем ли
//        ученикам будет, где сесть.
public class Ex7_7 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите количество учеников в классе");
        int a = reader.nextInt();
        System.out.println("Введите количество стульев");
        int b = reader.nextInt();
        String result = a <= b ? "стульев всем хватит" : "стульев на всех не хватит";
        System.out.println(result);
    }
}