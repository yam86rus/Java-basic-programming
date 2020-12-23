package Chapter19;

import java.util.Arrays;

//Задание 19.45
//        Напишите метод, который принимает в качестве параметра массив
//        целых чисел и сдвигает все элементы массива, кроме последнего, на
//        одну позицию вправо. Значение, находившееся в последней ячейке
//        массива, переходит в первую ячейку (правый сдвиг).
public class Ex19_45 {
    static int[] foo1(int[] arr) {
        int[] result = new int[arr.length];
        result[0] = arr[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            result[i + 1] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {12, 23, 34, 45, 56, 67, 78, 89, 90};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(foo1(a)));

    }


}
