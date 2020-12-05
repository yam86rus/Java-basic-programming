package Chapter19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//Задание 19.19
//        Напишите метод, который получает в качестве параметра массив и
//        заполняет его положительными случайными двузначными числами
//        так, чтобы они образовывали возрастающую последовательность (каждый элемент больше предыдущего).
public class Ex19_19 {
    static List<Integer> foo (int[] array) {
        List <Integer> list = new ArrayList<>();
        int down = 10;
        int up = 99;
        while (list.size()<array.length){
            int a = down+(int)((up-down+1)*Math.random());
            if (!list.contains(a)){
                list.add(a);
            }
        }
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args) {
        int [] myArray = new int[10];
        System.out.println(foo(myArray));
    }
}
