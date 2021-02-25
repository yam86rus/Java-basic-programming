package Chapter21;

import java.util.*;

//Задание 21.19
//        Напишите класс, который принимает с клавиатуры строку, состоящую
//        из букв, цифр и иных символов. Класс должен вывести на экран сумму
//        всех целых чисел в строке. Например, для ввода alb23c4%&50 класс
//        должен вывести результат 1 +23+4+50=78.
public class Ex21_19 {
    static void foo(String s) {
        List<Integer> list = new ArrayList<>();
        String[] array = s.split("\\D");
//        System.out.println(Arrays.toString(array));
        for (String s1 : array) {
            if (s1.isEmpty()) {
                continue;
            } else {
                list.add(Integer.valueOf(s1));
            }
        }
        Integer result = list.stream().reduce(0, Integer::sum);
//        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() - 1) {
                System.out.print("" + list.get(i) + "+");
            } else {
                System.out.print("" + list.get(i) + "=");
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        String s = "alb23c4%&50";
        foo(s);
    }
}
