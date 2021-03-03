package Chapter21;

//Задание 21.24
//        Напишите метод, который получает в качестве параметра массив, каждый
//        элемент которого является строкой. Метод должен вернуть строку,
//        содержащую максимальное количество заглавных букв.
public class Ex21_24 {
    static int foo(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                result++;
            }
        }
        return result;
    }

    static String foo1(String[] ar) {
        String result = "";
        int temp = foo(ar[0]);
        for (String str : ar) {
            if (temp < foo(str)) {
                result = str;
                temp = foo(str);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] str1 = {"Иванов", "ПЕтрОв", "СидоРов"};
        System.out.println(foo1(str1));
    }
}
