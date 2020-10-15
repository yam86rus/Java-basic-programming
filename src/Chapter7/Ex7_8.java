package Chapter7;

import java.util.Scanner;

//Задание 7.8
//        Напишите класс, который принимает с клавиатуры два числа, первое
//        из которых - количество учеников в классе, а второе - количество
//        столов в классной комнате. Программа должна проверить, всем ли
//        ученикам будет, где сесть.
//        Предполагается, что за столом могут сидеть два ученика.
public class Ex7_8 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите количество учеников в классе");
        int a = reader.nextInt();
        System.out.println("Введите количество столов");
        int b = reader.nextInt();
        String result = b * 2 > a ? "Парт всем хватит" : "Парт всем не хватит";
        System.out.println(result);
    }
}
