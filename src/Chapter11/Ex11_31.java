package Chapter11;

//Задание 11.31
//        Напишите класс, который выводит на экран положительные двузначные
//        числа, заканчивающиеся на цифру 7 (начиная с наименьшего).
public class Ex11_31 {
    public static void main(String[] args) {
        System.out.println("start");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + "7" + " ");
        }
        System.out.println();
        System.out.println("finish");
    }
}
