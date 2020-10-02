package Chapter17;

//Задание 17.10
//        Напишите метод, который принимает в качестве параметров целое
//        число и возвращает сумму его цифр.

public class Ex17_10 {

    static int foo(int a) {
        StringBuilder sb = new StringBuilder("" + a);
        int result = 0;
        for (int i = 0; i < sb.length(); i++) {
            int x = sb.charAt(i) - '0'; // получаем int из char
            result += x;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(foo(12345));
    }
}
