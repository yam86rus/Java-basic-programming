package Chapter21;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Задание 21.21
//        1. Напишите метод, который принимает в качестве параметра строковое
//        значение и проверяет, состоит ли оно из не повторяющихся
//        ни разу символов.
//        2. Напишите класс, который принимает с клавиатуры серию строковых
//        значений. Ввод значений прекращается, когда с клавиатуры
//        будет введено stop. Класс должен подсчитать, сколько введенных
//        с клавиатуры значений были «уникальными», то есть состояли из
//        неповторяющихся символов.
public class Ex21_21 {
    public static void foo(String s) {
        int n1 = s.length();
        String[] array = s.split("");
        Set<String> set = new HashSet<>();
        set.addAll(Arrays.stream(array).collect(Collectors.toSet()));
        int n2 = set.size();
        String result = (n1 == n2) ? "Слово состоит из ни разу не повторяющихся символов" : "Слово имеет повторение символов";
        System.out.println(result);
    }

    public static void main(String[] args) {
        String s = "ало";
        foo(s);
    }
}
