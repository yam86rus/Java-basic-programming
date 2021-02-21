package Chapter21;
//Задание 21.14
//        Напишите метод, который получает в качестве параметра строку и
//        возвращает новую строку, составленную из тех же символов, но в обратном
//        порядке.
public class Ex21_14 {
    String foo(String s){
        return new StringBuilder(s).reverse().toString();
    }
    public static void main(String[] args) {
        String s = "утро воскресения";
        System.out.println(s);
        System.out.println(new Ex21_14().foo(s));

    }
}
