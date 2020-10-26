package Chapter10;

//Задание 10.14
//        Напишите класс, который создает и выводит на экран 5 случайных целых
//        чисел, заканчивающихся на ноль, и принадлежащих к диапазону
//        двузначных чисел.
public class Ex10_14 {
    public static void main(String[] args) {
        int down = 1, up = 9;
        for (int i = 1; i <= 5; i++) {
            int a = down + (int) ((up - down + 1) * Math.random());
            System.out.println(a*10);
        }
    }
}
