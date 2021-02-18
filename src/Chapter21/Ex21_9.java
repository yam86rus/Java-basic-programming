package Chapter21;

import java.util.Scanner;

//Задание 21.9
//не скопировалось (
public class Ex21_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner.next();
        System.out.println("Введите фамилию");
        String surname = scanner.next();
        if (name.length()>surname.length()){
            System.out.println("В имени больше букв, чем в фамилии");
        } else if (name.length()<surname.length()){
            System.out.println("В фамилии больше букв, чем в имени");
        } else {
            System.out.println("Количество букв в имени и фамилии одинаково");

        }

    }
}
