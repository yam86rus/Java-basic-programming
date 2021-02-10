package Chapter20;

import java.util.Arrays;

//Задание 20.2
//        Напишите метод, который принимает в качестве параметра массив
//        целых чисел, в котором мoryr быть и отрицательные числа, и положительные,
//        и нули.
//        Метод должен возвращать массив, который содержит информацию о
//        сумме положительных значений в массиве-параметре, о сумме отрицательных
//        значений в массиве-параметре, а также о том, сколько раз в
//        массиве-параметре встречался ноль.
public class Ex20_2 {
    static int[] foo(int[] a) {
        int n1 = 0, n2 = 0, n3 = 0;
        for (int number : a) {
            if (number < 0) n1++;
            else if (number == 0) n2++;
            else n3++;
        }
        return new int[] {n1, n2, n3};
    }

    public static void main(String[] args) {
        int[] arr = {-1, -2, 0, 1, 2};
        System.out.println(Arrays.toString(foo(arr)));
    }
}
