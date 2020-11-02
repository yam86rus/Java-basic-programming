package Chapter13;
//Задание 13.3
//        Напишите класс, который генерирует серию из 20 случайных положительных
//        двузначных чисел и определяет сумму четных значений в серии.
public class Ex13_3 {
    static int showSeries(int min, int max, int c) {
        // диапазон генереции случайного числа от минимального (min)
        // до максимального (max)
        // продолжительность серии (c)
        int summ = 0; // итоговая сумма в серии
        for (int i = 1; i <= c; i++) {
            int n = min + (int) ((max - min + 1) * Math.random());
            if (n%2==0) summ += n;
        }
        return summ;
    }

    public static void main(String[] args) {
        System.out.println("Сумма в серии из 20-ти случайных положительных четных двухзначных чисел: " + showSeries(10, 99, 20));

    }

}
