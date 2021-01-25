package Chapter19;

import java.util.Arrays;

//Задание 19.57
//        Напишите метод, который получает в качестве параметров целое число
//        Х и массив целых чисел А.
//        Метод возвращает массив, состоящий из тех значений массива А, которые
//        меньше значения Х.
public class Ex19_57 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        System.out.println(Arrays.toString(arr));
        int b = 5;
        System.out.println(Arrays.toString(Arrays.stream(arr).filter(e -> e < b).toArray()));
    }
}
