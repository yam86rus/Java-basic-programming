package Chapter19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Задание 19.56
//        Напишите метод, который принимает в качестве параметра массив
//        целых чисел А и возвращает новый массив В, состоящий только из четных
//        элементов массива А.
public class Ex19_56 {
    static int[] foo(int[] a) {
        List<Integer> list1 = new ArrayList<>();

        for (int i = 1; i < a.length; i += 2) {
            list1.add(a[i]);
        }
        return list1.stream().mapToInt(e -> e).toArray();
    }

    static int[] foo(List<Integer> l) {
        List<Integer> l2 = new ArrayList<>();
        for (int i = 1; i < l.size(); i++) {
            l2.add(l.get(i));
        }
        return l2.stream().mapToInt(e -> e).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = foo(arr);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        int[] arr3 = foo(list);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
