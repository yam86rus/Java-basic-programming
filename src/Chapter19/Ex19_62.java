package Chapter19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Задание 19.62
//        Напишите метод, который принимает в качестве параметров два массива
//        целых чисел; размеры массивов одинаковы.
//        Метод определяет, сколько пар «параллельных» (с одинаковыми номерами)
//        ячеек в этих массивах содержат одинаковые значения, и возвращает
//        новый массив, содержащий эти значения.
//        Например, для массивов 4, 6, 7, 2, 5, 3 и 5, 6, 2, 2, 4, 3 метод возвращает
//        массив 6, 2, 3.
public class Ex19_62 {
    static void foo(int[] array1, int[] array2) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            if (array1[i]==array2[i]) list.add(array1[i]);
        }
        System.out.println(list);
        int [] result = list.stream().mapToInt(e->e).toArray();
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 2, 3, 5, 7};
        foo(arr1, arr2);

    }
}
