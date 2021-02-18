package Chapter21;

import java.util.Scanner;

//21.10
public class Ex21_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner.next();
        System.out.println("Введите фамилию");
        String surname = scanner.next();
        if (name.startsWith(String.valueOf(surname.charAt(0)))) {
            System.out.println("Имя и фамилия начинаютсся с одной буквы");
        } else {
            System.out.printf("Имя и фамили начинаются с разных букв");
        }
    }
}
