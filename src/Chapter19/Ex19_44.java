package Chapter19;

import java.util.Arrays;

//Задание 19.44
//        Напишите метод, который принимает в качестве параметра массив
//        целых чисел и сдвигает все элементы массива, кроме первого, на одну
//        позицию влево. Значение, находившееся в начальной ячейке массива,
//        переходит в последнюю ячейку (левый сдвиг).
public class Ex19_44 {
    static int[] foo(int[] array) {
        int[] result = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            result[i - 1] = array[i];
        }
        result[result.length - 1] = array[0];
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(a));
        int[] b = foo(a);
        System.out.println(Arrays.toString(b));
    }
}
