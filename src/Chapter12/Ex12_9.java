package Chapter12;

//Задание 12.9
//        Определим как «красивое» целое положительное трехзначное число Х,
//        для которого выполняется следующее условие: сумма квадратов первой
//        и последней цифр равна квадрату средней цифры.
//        Напишите класс, который выводит на экран все «красивые» числа и их
//        количество.
public class Ex12_9 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            int n1 = i / 100;
            int n2 = i / 10 % 10;
            int n3 = i % 10;
            if ((n1 * n1 + n3 * n3) == n2 * n2) {
                System.out.print(i + " ");
            }
        }
    }
}