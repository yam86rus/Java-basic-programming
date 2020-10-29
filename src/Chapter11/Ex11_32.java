package Chapter11;
//Задание 11.32
//        Напишите класс, который выводит на экран положительные двузначные
//        числа, заканчивающиеся на цифру 7 (начиная с наибольшего).
public class Ex11_32 {
    public static void main(String[] args) {
        System.out.println("start");
        for (int i = 9; i >= 1; i--) {
            System.out.print(i + "7" + " ");
        }
        System.out.println();
        System.out.println("finish");
    }
}
