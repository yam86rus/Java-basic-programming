package Chapter21;

//Задание 21.4
//        Напишите метод, который получает в качестве параметра строку и выводит
//        на экран все символы строки, - каждый в отдельной строчке.
public class Ex21_4 {
    static void foo(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
    static void foo2(String s){
        String [] a = s.split("");
        for(String s1:a){
            System.out.println(s1);
        }
    }

    public static void main(String[] args) {
        String s = "слово";
        foo(s);
        foo2(s);
    }
}
