package Chapter9;

import java.util.Scanner;

//Задание 9.37
//        Напишите класс, который принимает с клавиатуры имя и фамилию
//        одного человека, а затем имя и фамилию другого.
//        Класс должен проверить, являются ли эти два человека:
//        • тезками, но не однофамильцами;
//        • однофамильцами, но не тезками;
//        • и тезками, и однофамильцами.
//        По результатам проверки следует вывести на экран соответствующее
//        сообщение.
public class Ex9_37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя и фамилию первого человека");
        String str1 = scanner.nextLine();
        System.out.println("Введите имя и фамилию второго человека");
        String str2 = scanner.nextLine();

        int x1 = str1.indexOf(' ');
        int x2 = str2.indexOf(' ');
        String firstName1 = str1.substring(0, x1);
        String lasttName1 = str1.substring(x1);

        String firstName2 = str2.substring(0, x2);
        String lasttName2 = str2.substring(x2);

        if (firstName1.equals(firstName2) && !lasttName1.equals(lasttName2)) System.out.println("Тезки");
        if (lasttName1.equals(lasttName2) && !firstName1.equals(firstName2)) System.out.println("Однофамильцы");
        if (lasttName1.equals(lasttName2) && firstName1.equals(firstName2))
            System.out.println("И тезки и однофамильцы");
    }
}
