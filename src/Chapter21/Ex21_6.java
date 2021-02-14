package Chapter21;
//Задание 21.6
//        Напишите метод, который получает в качестве параметра строку и выводит
//        на экран:
//        • первый символ строки;
//        • два первых символа;
//        • три первых символа и так далее.
public class Ex21_6 {
    static void foo(String str){
        for (int i=0; i<str.length();i++){
            System.out.println(str.substring(0,i+1));
        }
    }
    public static void main(String[] args) {
        String s = "Слово";
        foo(s);
    }
}
