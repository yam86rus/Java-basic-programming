package Chapter21;

import java.util.Scanner;

//Задание 21.11
public class Ex21_11 {
    public static void foo(String s){
        String result = (s.charAt(0)==s.charAt(s.length()-1))? "совпадают": "не совпадают";
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию");
        String s = scanner.next();
        foo(s);
    }
}
