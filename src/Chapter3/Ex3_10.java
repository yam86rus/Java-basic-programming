package Chapter3;

import java.util.Scanner;

//Задание 3.10
//        Подрабатывая в течение года, Вася собрал себе определенную сумму на
//        поездку за границу, а родители добавили ему от себя еще некоторую
//        сумму.
//        Напишите класс, который принимает с клавиатуры три значения: первое
//        - сумма в рублях, заработанная Васей, второе - сумма в рублях,
//        которую ему дали родители, третье - курс рубля по отношению к евро.
//        Класс должен подсчитать и вывести на экран сумму в евро, которая
//        имеется у Васи для поездки за границу.
public class Ex3_10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите сумму собранную Васей");
        double a = reader.nextDouble();
        System.out.println("Введите сумму, которую дали родители");
        double b = reader.nextDouble();
        System.out.println("Введите курс евро");
        double c = reader.nextDouble();

        System.out.println("Сумма для поездки на руках в евро: " + ((a + b) / c));
    }
}
