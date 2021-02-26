package Chapter21;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

//Задание 21.20
//        1. Напишите метод, который принимает в качестве параметра строковое
//        значение и возвращает новое строковое значение, составленное
//        из тех символов, которые в значении параметра встречаются ровно
//        один раз. Например, если в качестве параметра метод принимает
//        значение абракадабра, то он возвращает значение кд.
//        2. Напишите класс, который принимает с клавиатуры 25 строковых
//        значений и «стирает» из каждого из них все повторяющиеся значения.
//        Класс также определит, какое из «обновленных» значений
//        было самым длинным.
public class Ex21_20 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        String s = "абракадабра";
        set.addAll(Arrays.stream(s.split("")).collect(Collectors.toSet()));
        System.out.println(set);


    }
}
