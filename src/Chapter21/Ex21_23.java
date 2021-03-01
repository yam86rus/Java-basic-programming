package Chapter21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Задание 21.23
//        Напишите метод, который получает в качестве параметра массив, каждый
//        элемент которого является строкой. Метод должен вернуть самую
//        длинную строку, находящуюся в массиве.
public class Ex21_23 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Иванов");
        list.add("Васильев");
        list.add("Федоров");
        list.add("ЯЯЯЯяяяяяяяяяя");
        System.out.println(list);
        // TODO
    }
}
