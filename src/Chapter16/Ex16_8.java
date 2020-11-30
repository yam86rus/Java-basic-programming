package Chapter16;
//Задание 16.8
//        Напишите класс, который будет выводить на экран суммы делителей
//        каждого числа от 1 до 75.
public class Ex16_8 {
    static void foo(int i) {
        int summ = 0;
        for (int j = 1; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                summ += j;
            }
        }
        System.out.println("Сумма всех делители числа " + i + " равна " + summ);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 75; i++) {
            foo(i);
        }
    }
}
