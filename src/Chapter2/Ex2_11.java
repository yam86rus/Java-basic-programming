package Chapter2;

//Задание 2.11
//        Напишите класс, который выводит на экран в одной строке ваше имя и
//        фамилию, в друтой - телефон, все это - в рамке из «звездочек» ().
//        Например:
//        Иван Иванов
//        7-841-266666
public class Ex2_11 {
    public static void main(String[] args) {
        String name = "Maksim";
        String surname = "Yakushev";
        String phone = "7-841-266666";

        for (int i = 0; i < (name.length() + surname.length() + 5); i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("* " + name + " " + surname + " *");
        System.out.print("* " + phone);

        for (int i = 0; i < (name.length() + surname.length() +2 - phone.length()); i++) {
            System.out.print(" ");
        }
        System.out.println("*");
        for (int i = 0; i < (name.length() + surname.length() + 5); i++) {
            System.out.print("*");
        }

    }
}
