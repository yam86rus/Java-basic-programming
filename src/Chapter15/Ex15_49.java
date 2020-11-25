package Chapter15;

import java.util.ArrayList;
import java.util.Scanner;

//Задание 15.49
//        Напишите класс, который принимает с клавиатуры оценки, полученные
//        группой учеников, и определяет среднюю арифметическую оценку
//        в группе.
//        Ввод данных завершается, когда очередное вводимое с клавиатуры
//        значение не является оценкой.
public class Ex15_49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList();
        double ave = 0.00;
        while (true) {
            System.out.println("Введите оценку ученика");
            int a = scanner.nextInt();
            if (a > 5 || a < 2) {
                break;
            } else {
                ave += a;
                arrayList.add(a);
            }
        }
        System.out.println("Средняя оценка ученика " + ave / arrayList.size());
    }
}
