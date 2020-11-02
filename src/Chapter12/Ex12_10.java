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
        int result = 0; // количество двоечников
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество учеников");
        int a = scanner.nextInt(); // количество учеников
        for (int i = 1; i <= a; i++) {
            int b = scanner.nextInt();
            if (b==2) result++;
        }
        System.out.println("Всего учеников " + a);
        System.out.println("Из них получили неуд " + result);
        if (result>a/2){
            System.out.println("Контрольная провалена");
        } else {
            System.out.println("Контрольная не провалена");
        }
    }
}
