package Chapter10;

//Задание 10.1
//        Напишите класс, который генерирует и выводит на экран случайное
//        целое чисел из диапазона положительных двузначных чисел.
public class Ex10_1 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
        System.out.println(a);
    }
}
