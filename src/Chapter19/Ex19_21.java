package Chapter19;

import java.util.ArrayList;
import java.util.List;

//Задание 19.21
//        Напишите метод, который получает в качестве параметра массив и
//        заполняет его случайными двузначными числами так, чтобы значения
//        элементов в массиве не повторялись.
public class Ex19_21 {
    private static List<Integer> foo(int[] array) {
        int down = 10, up = 99;
        List<Integer> list = new ArrayList<>();
        while (list.size() < array.length) {
            int a = down + (int) ((up - down + 1) * Math.random());
            if (!list.contains(a)) {
                list.add(a);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(foo(new int[15]));
    }
}
