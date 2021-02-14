package Chapter21;
//Задание 21.3
//        Напишите метод, который получает в качестве параметра строку и выводит
//        на экран ее первый и последний символы.
public class Ex21_3 {
    public void foo(String str) {
        System.out.println(str.charAt(0));
        int l = str.length();
        System.out.println(str.charAt(l-1));
    }
    public static void main(String[] args) {
        String s = "Напишите";
        Ex21_3 test = new Ex21_3();
        test.foo(s);
    }
}
