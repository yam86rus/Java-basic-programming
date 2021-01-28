package Chapter19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Задание 19.60
//        Напишите метод, который получает в качестве параметров два массива
//        (не обязательно одинакового размера) целых чисел.
//        Метод возвращает массив значений, которые присутствуют в первом
//        массиве, но не присутствуют во втором.
// 10 20 30 40
// 50 10 70

public class Ex19_60 {
    static int[] foo(int[] a, int[] b) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    break;
                } else {
                    list.add(Integer.valueOf(a[i]));
                    break;
                }
            }
        }
        return list.stream().mapToInt(e->e).toArray();
    }

    public static void main(String[] args) {
        int[] ar1 = {10, 20, 30, 40};
        int[] ar2 = {50, 10, 70};
        int[] result = foo(ar1, ar1);
        System.out.println(Arrays.toString(result));
    }
}
