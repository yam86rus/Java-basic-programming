package Chapter2;
//Задание 2.9
//        Напишите класс, который присваивает переменной х значение 9, а затем
//        выводит на экран: в первой строке - это значение с поясняющей
//        надписью (например, «значение х равно 9»), а во второй - квадрат
//        этого значения (тоже с поясняющей надписью).
public class Ex2_9 {
    public static void main(String[] args) {
        int x = 9;
        System.out.println("Значение x равно " + x);
        System.out.println("Квадрат числа x равен " + x*x);
    }
}
