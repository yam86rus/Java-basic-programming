package Chapter21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Задание 21.7
//        Напишите класс, который читает с клавиатуры 15 фамилий учеников и
//        выводит на экран число учеников, чья фамилия начинается с буквы А
//        или буквы Я.
public class Ex21_7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println("Введите фамилии учеников");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(scanner.next());
        }
        for (int i =0; i<list.size();i++){
            if (list.get(i).startsWith("А") || list.get(i).startsWith("Я")){
                System.out.println(list.get(i));
            }
        }
    }
}
