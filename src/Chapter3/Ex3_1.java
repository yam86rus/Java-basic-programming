package Chapter3;

import java.util.Scanner;

//Задание 3.1
//        Связь между температурой по шкале Цельсия и температурой по шкале
//        Фаренгейта выражается формулой: C=5(F-32)/9, где С - температура
//        по шкале Цельсия, F - температура по шкале Фаренгейта.
//        Напишите класс, который принимает с клавиатуры температуру по
//        шкале Фаренгейта, а затем выводит на экран эту же температуру, но по
//        шкале Цельсия.
public class Ex3_1 {
    static void showInfo() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите температуру в Фаренгейтах");
        double a = reader.nextDouble();
        System.out.println("Температура в Цельсиях равна = " + 5.00*(a - 32) /9);
    }
}

class Test3_1 {

    public static void main(String[] args) {
        Ex3_1.showInfo();
    }
}
