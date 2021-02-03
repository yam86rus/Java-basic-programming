package Chapter19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Задание 19.65
//        Назовем «точкой баланса» такую ячейку массива, для которой выполняется
//        следующее правило: сумма значений в ячейках до «точки баланса
//        » равна сумме значений в ячейках «после суммы баланса».
//        Например, в массиве 3, 5, 7, 2, -3, 5, 8, -4 ячейка номер 2 (содержит значение
//        7) - «точка баланса».
//        Напишите метод, который получает в качестве параметра массив целых
//        чисел.
//        Метод возвращает значение true, если в массиве имеется хотя бы одна
//        «точка баланса»; в ином случае метод возвращает значение false.
public class Ex19_65 {
    static boolean foo(int[] a) {
        int sum = Arrays.stream(a).sum();
        System.out.println(sum);
        int result = 0;
        boolean res = false;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
            if (result == sum-result)
                res = true;
        }
        return res;
    }

    public static void main(String[] args) {

        int[] ar = {1,1,1,1,1};
        List<Integer> list = new ArrayList<>();
        for (int n : ar) {
            list.add(n);
        }
        System.out.println(foo(ar));
    }
}

