package Chapter9;

import java.util.Scanner;

//Задание 9.36
//        Напишите класс, который принимает с клавиатуры два строковых значения,
//        каждое из которых содержит имя человека, и проверяет, являются
//        ли эти люди тезками. По результатам проверки следует вывести
//        на экран соответствующее сообщение.
public class Ex9_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое имя");
        String str1 = scanner.next();
        System.out.println("Введите второе имя");
        String str2 = scanner.next();
        if (str1.equals(str2)) {
            System.out.println("Строки одинаковы");
        } else {
            System.out.println("Строки разные");
        }
    }
}
