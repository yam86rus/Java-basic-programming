package Chapter21;

//Задание 21.12
//        1. Напишите метод, который принимает в качестве параметров
//        строковое и символьное значения и подсчитывает, сколько раз
//        символьное значение-параметр встречается в строковом значении-
//        параметре. Найденный результат метод возвращает.
//        2. Напишите класс, который принимает с клавиатуры имена и фамилии
//        15 человек. Класс должен подсчитать, у какого количества человек
//        из этих 15-ти первая буква имени встречается в фамилии более
//        одного раза. Полученный результат следует вывести на экран.
public class Ex21_12 {
    static int foo(String s, int n) {
        String n1 = String.valueOf(n);
        int result = s.length() - (s.replaceAll(n1, "")).length();
        return result;
    }

    public static void main(String[] args) {
        String s = "Ма2ксим2Макс22им";
        int n = 2;
        System.out.println(foo(s, n));
    }
}
