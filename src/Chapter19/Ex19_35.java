package Chapter19;

import java.util.Arrays;

//Задание 19.35
//        Напишите метод, который принимает в качестве параметра массив и
//        возвращает:
//        • значение true, если количество ячеек со значениями, меньшими
//        среднего арифметического всего массива, равно количеству ячеек
//        со значениями большими среднего арифметического всего массива;
//        • значение false в ином случае.
public class Ex19_35 {
    static boolean foo(int[] array) {
        int counterDown = 0;
        int counterUp = 0;
        double avr = Arrays.stream(array).sum() / array.length;
        System.out.println("avr " + avr);
        for (double d : array) {
            if (d < avr) {
                counterDown++;
            } else {
                counterUp++;
            }
        }
        System.out.println("counterDown " + counterDown);
        System.out.println("counterUp " + counterUp);
        return (counterDown == counterUp) ? true : false;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4,5,6, 6, 7, 8, 18};
        System.out.println(foo(a));
    }
}
