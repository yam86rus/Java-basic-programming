package Chapter12;

import java.util.Scanner;

//Задание 12.10
//        Контрольная работа считается «провальной», если более половины
//        учеников получили неудовлетворительные оценки.
//        Напишите класс, который принимает с клавиатуры число учеников в
//        группе, а затем - оценку каждого ученика.
//        Класс должен определить, была ли контрольная «провальной».
public class Ex12_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество учеников");
        int summ = 0; // количество двоечников
        int a = scanner.nextInt(); // количество учеников
        for (int i = 1; i <= a; i++) {
            int b = scanner.nextInt();
            if (b == 2) summ++;
        }
        String result = (summ > a / 2) ? "провалена" : "не провалена";
        System.out.println("Контрольная " + result);
    }
}
