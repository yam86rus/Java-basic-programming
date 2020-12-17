package Chapter19;

import java.util.Arrays;
import java.util.OptionalInt;

//Задание 19.38
//        Напишите метод, который принимает в качестве параметра массив
//        целых чисел и выводит на печать порядковые номера всех ячеек, содержащих
//        максимальное значение.
public class Ex19_38 {
    static void foo(int[] array) {
        int max = 0;

        if (array.length == 0) {
            System.out.println("0");
        } else {
            for (int i = 0; i <= array.length - 1; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
        }

        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] == max) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] b = {2, 7, 3, 4, 7, 5, 6, 7};
        foo(b);
    }
}
