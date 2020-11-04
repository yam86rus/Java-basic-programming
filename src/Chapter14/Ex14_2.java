package Chapter14;

import java.util.Scanner;

//Задание 14.2
//        В соревнованиях по бегу принимали участие 150 учеников школы.
//        Напишите класс, который принимает с клавиатуры время, показанное
//        в соревнованиях каждым из учеников, и выводит на экран наилучший
//        результат, а также порядковый номер победителя (можно предположить, что есть только один победитель).
public class Ex14_2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите время");
        int bestScore = scanner.nextInt();
        int numberOfWinner = 1;
        for (int i = 1; i <= 5; i++) {
            int a = scanner.nextInt();
            if (a < bestScore) {
                bestScore = a;
                numberOfWinner = i+1;
            }

        }
        System.out.println("Лучшее время " + bestScore);
        System.out.println("Номер победителя " + numberOfWinner);
    }
}
