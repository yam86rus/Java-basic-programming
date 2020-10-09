package Chapter2;

import java.util.Scanner;

//Задание 2.26
//        Напишите класс, который принимает с клавиатуры два целых числа,
//        первое из которых представляет собой год рождения, а второе - нынешний
//        (текущий) год. Класс должен вывести на экран возраст (в целых
//        годах).
public class Ex2_26 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a = reader.nextInt();
        int b = reader.nextInt();
        System.out.println("Возраст = " + (b-a));
    }
}
