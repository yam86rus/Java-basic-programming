package Chapter15;
//Задание 15.47
//        На спектакль в кассу театра было выделено определенное количество
//        билетов, и продажа осуществлялась до тех пор, пока не были проданы
//        все билеты.
//        Напишите класс, который сначала принимает с клавиатуры количество
//        билетов, переданных в кассу. Затем класс принимает с клавиатуры серию чисел, каждое из которых указывает на число билетов, которое
//        желает приобрести очередной покупатель.
//        Если нет возможности продать очередному покупателю требуемое им
//        число билетов, принимается заказ от следующего покупателя.
//        Класс должен вывести на экран следующую итоговую информацию:
//        • какое число покупателей приобрели билеты;
//        • какому числу покупателей было отказано в продаже билетов.

import java.util.Scanner;

public class Ex15_47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество билетов, переданных в кассу");
        int a = scanner.nextInt();
        int count = 0; // количество покупателей билетов, которые приобрели билеты
        int count1 = 0; // количество покупателей, которым было отказано в покупке билетов
        while (a > 0) {
            System.out.println("Введите количество билетов, которое Вы хотите купить");
            int b = scanner.nextInt();
            if (a - b >= 0) {
                a -= b;
                count++;
            } else {
                System.out.println("Билетов не хватает");
                count1++;
            }
        }
        System.out.println("Число покупателей, купившие билеты " + count);
        System.out.println("Число покупателей, которым было отказано в покупке билетов " + count1);
    }
}