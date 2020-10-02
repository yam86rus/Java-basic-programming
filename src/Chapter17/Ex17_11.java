package Chapter17;
//Задание 17.11
//        Напишите метод, который принимает в качестве параметра целое число
//        и возвращает количество цифр в этом числе.

public class Ex17_11 {
    static int count(int a){
        String st = new String("" + a);
        return st.length();
    }

    public static void main(String[] args) {
        System.out.println(count(123456789));
    }
}
