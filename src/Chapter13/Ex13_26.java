package Chapter13;

//Задание 13.26
//        Напишите класс, который создает серию из 15 случайных чисел из
//        диапазона -30 ... + 30.
//        Класс будет выводить на экран только те числа серии, которые имеют
//        такой же знак, как и предшествующее им число (значение О считать
//        положительным для данного задания).
public class Ex13_26 {
    public static void main(String[] args) {
        int down = -30, up = 30;
        int a = down + (int) ((up - down + 1) * Math.random());
        System.out.println("Первое случайное число " + a + " ");
        System.out.println("Следующие случайные числа");
        for (int i = 1; i <= 15; i++) {
            int b = down + (int) ((up - down + 1) * Math.random());
            if (b >= 0 && a >= 0) {
                System.out.print(b + " ");
            } else if (b < 0 && a < 0) {
                System.out.print(b + " ");

            }
        }
    }
}
