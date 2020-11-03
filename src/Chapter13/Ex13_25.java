package Chapter13;

//Задание 13.25
//        Напишите класс, который создает серию из 25 случайных чисел из
//        диапазона 10 ... 99.
//        Класс будет выводить на экран только те числа серии, которые делятся
//        без остатка на первое число в серии.
public class Ex13_25 {
    public static void main(String[] args) {

        int down = 10, up = 99;
        int firstNumber = down + (int) ((up - down + 1) * Math.random());
        System.out.println("Первое случайное число " + firstNumber);
        int i = 0;
        while (i++ <= 24) {
            int a = down + (int) ((up - down + 1) * Math.random());
            if (a % firstNumber == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
