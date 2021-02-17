package Chapter21;

import java.util.Scanner;

//Задание 21.8
//Напишите класс, который принимает с клавиатуры два строковых значения,
//        каждое из которых содержит имя человека, и проверяет, являются
//        ли эти люди тезками. По результатам проверки следует вывести
//        на экран соответствующее сообщение.
public class Ex21_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое имя");
        String name1 = scanner.next();
        System.out.println("Введите Второе имя");
        String name2 = scanner.next();
        String result = (name1.equals(name2)) ? "Тезки" : "Не тезки";
        System.out.println(result);
    }
}
