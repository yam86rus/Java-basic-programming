package Chapter16;

//Задание 16.6
//        Старинная задача: сколько можно купить быков и коров на 100 рублей,
//        если плата за быка 10 рублей, за корову- 5 рублей (во всех вариантах).
//        Напишите класс, который выводит на экран все возможные варианты
//        решения задачи.
public class Ex16_6 {
    public static void main(String[] args) {
        int cowPrice = 5;
        int bullPrice = 10;
        int money = 100;
        int count = 0;
        for (int i = 0; i <= 100; i += 5) {
            if (money / 10 > 0) {
                System.out.println("коров " + (i / cowPrice) + " быков " + (money - i) / bullPrice);
                count++;
            }
        }
        System.out.println("Всего вариантов: " + count);
    }
}
