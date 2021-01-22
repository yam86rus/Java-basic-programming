package Chapter19;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//Задание 19.54
//        Напишите метод, который принимает в качестве параметра массив
//        целых чисел А и возвращает новый массив В, состоящий из элементов
//        массива А, упорядоченных так, чтобы все положительные элементы
//        массива А находились в начале массива В, все отрицательные - в конце,
//        а все нулевые элементы - в середине.
public class Ex19_54 {


    public static void main(String[] args) {
        int[] array = {3, -10, 1, -4, 9, -6, 7, -8, 5, -2};
        System.out.println(Arrays.toString(array));
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);

    }
}
