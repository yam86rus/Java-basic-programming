package Chapter19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Задание 19.55
//        Напишите метод, который принимает в качестве параметра массив
//        целых чисел А и возвращает новый массив В, состоящий только из элементов
//        массива А, находящихся на четных местах (в ячейках с четными
//        номерами).
public class Ex19_55 {
    static int[] foo(int[] ar) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < ar.length; i += 2) {
            list.add(ar[i]);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 7, 6, 5, 4, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(foo(array)));
    }
}
