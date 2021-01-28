package Chapter19;
import java.util.Arrays;

import static  Chapter19.Ex19_58.foo ;
//Задание 19.59
//        Напишите метод, который получает в качестве параметров два массива
//        (не обязательно одинакового размера, состоящие из неповторяющихся
//        элементов) целых чисел.
//        Метод возвращает массив значений, которые присутствуют и в первом
//        массиве, и во втором.
public class Ex19_59 {
    public static void main(String[] args) {
        int[] ar1 = {10,20,30,40};
        int[] ar2 = {50,60};
        System.out.println(Arrays.toString(foo(ar1,ar2)));
    }
}
