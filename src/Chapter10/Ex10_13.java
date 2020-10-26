package Chapter10;

import javafx.scene.transform.Scale;

import java.util.Scanner;

//Задание 10.13
//        Два человека играют в кости по следующим правилам: в каждом раунде
//        игры (а она состоит из 10 раундов) каждый из участников бросает
//        «кость» (кубик, на гранях которого значения от 1 до 6). В каждом раунде
//        определяется победитель или фиксируется состояние «ничья», в зависимости
//        от значения, которое выпало на кубике участника.
//        Напишите класс, который моделирует эту игру, указывая для каждого
//        раунда, кто из игроков набрал в этом раунде больше очков - или сообщая
//        О СОСТОЯНИИ «НИЧЬЯ».
public class Ex10_13 {
    static int scoreFirstPlayer = 0;
    static int scoreSecondPlayer = 0;

    public static void main(String[] args) {
        int down = 1, up = 6;
        for (int i = 1; i <= 10; i++) {
            int player1 = down + (int) ((up - down + 1) * Math.random());
            int player2 = down + (int) ((up - down + 1) * Math.random());
            if (player1 > player2) {
                scoreFirstPlayer++;
                System.out.println("В раунде номер:" + i + " победил первый игрок " + player1 + " / " + player2);
            }
            if (player2 > player1) {
                scoreSecondPlayer++;
                System.out.println("В раунде номер:" + i + " победил второй игрок " + player1 + " / " + player2);
            }

            if (player1 == player2) {
                System.out.println("В раунде номер:" + i + " ничья " + player1 + " / " + player2);
            }
        }
        System.out.println("Общий счет игры:");
        System.out.println("Первый игрок: " + scoreFirstPlayer + " очков");
        System.out.println("Второй игрок: " + scoreSecondPlayer + " очков");

    }
}
