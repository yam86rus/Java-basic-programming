package Chapter19;

import java.util.ArrayList;
import java.util.List;

//Задание 19.20
//        Напишите метод, который получает в качестве параметра массив и
//        заполняет его положительными случайными двузначными числами
//        так, чтобы значения элементов в массиве не повторялись.
public class Ex19_20 {
    static List<Integer> foo(int[] array) {
        List<Integer> list = new ArrayList<>();
        int down = 10;
        int up = 99;
        while (list.size() < array.length) {
            int a = down + (int) ((up + down + 1) * Math.random());
            if (!list.contains(a)) {
                list.add(a);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(foo(new int[10]));
    }
}
