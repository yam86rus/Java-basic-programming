package Chapter19;

import java.util.Arrays;

//Задание 19.37
//        Напишите метод, который принимает в качестве параметра массив
//        целых чисел и возвращает порядковый номер ячейки, содержащей
//        максимальное значение.
//        Если в массиве есть несколько ячеек, содержащих максимальное значение,
//        метод вернет порядковый номер первой из них.
public class Ex19_37 {
    static int foo(int[] array) {
        int result = 0;
        int ind = 0;
        if (array.length == 0) {
            return result;
        } else {
            for (int i = 1; i <= array.length - 1; i++) {
                if (array[i] > result) {
                    result = array[i];
                    ind = i;
                }
            }
        }
        return ind;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 4, 3, 22, 1};
        System.out.println(foo(a));
    }
}
