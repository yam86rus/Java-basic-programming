package Chapter19;

import java.util.Arrays;

//Задание 19.46
//        Напишите метод, который принимает в качестве параметра массив
//        целых чисел и дополнительное целое число К. Если К положительное,
//        метод производит К правых сдвигов, если К отрицательное, - метод
//        производит К левых сдвигов.
public class Ex19_46 {
    static int[] foo1(int[] ar, int n1) {
        int[] ar2 = new int[ar.length];
        if (n1 > 0) {
            for (int i = n1; i < ar.length; i++) {
                ar2[i - n1] = ar[i];
            }
            for (int i = 0; i < n1; i++) {
                ar2[ar.length-n1+i]=ar[i];
            }
        }
        return ar2;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(foo1(a,3)));
    }
}
