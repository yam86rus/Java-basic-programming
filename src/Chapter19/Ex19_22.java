package Chapter19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Задание 19.22
//        Напишите метод, который принимает два параметра: массив целых
//        чисел М и еще одно целое число Х. Метод возвращает количество ячеек
//        массива М, содержащих значение Х (число появлений Х в М).

public class Ex19_22 {
    private static int foo(int[] array, int x) {
        int down = 0, up = 5;
        List<Integer> list = new ArrayList<>();
        while (list.size() < array.length) {
            int a = down + (int) ((up - down + 1) * Math.random());
            list.add(a);
        }
        System.out.println(list);
        int count = 0;
        count = list.size();
        list.removeIf(e -> e.equals(x));
        count -= list.size();
        return count;
    }

    public static void main(String[] args) {

        System.out.println("Число повторов числа 3: " + foo(new int[15], 3));


    }
}
