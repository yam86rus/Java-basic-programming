package Chapter19;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

//Задание 19.61
//        Напишите метод, который принимает в качестве параметра массив
//        целых чисел.
//        Метод возвращает массив, в котором значения из массива-параметра
//        записаны по принципу «каждое значение - только один раз».
//        Например, для массива-параметра 1, 1, 3, 4, 2, 2, 6, 7, 1 будет возвращен
//        массив 1, 3, 4, 2, 6, 7.
public class Ex19_61 {
    public static void main(String[] args) {
        int[] asd = {1, 1, 3, 4, 2, 2, 6, 7, 1};
        Set<Integer> asd1 = Arrays.stream(asd).boxed().collect(Collectors.toSet());
        System.out.println(asd1);


    }
}
