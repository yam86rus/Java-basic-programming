package Chapter10;

//Задание 10.7
//        Напишите класс, который генерирует два случайных положительных двузначных
//        числа, обозначающих границы некоторого интервала, а затем
//        генерирует три целых положительных числа внутри данного интервала.
public class Ex10_7 {
    public static void main(String[] args) {
        int down = 10, up = 99;
        int n1 = down + (int) ((up - down + 1) * Math.random());
        int n2 = down + (int) ((up - down + 1) * Math.random());
        int down1 = 0, up1 = 0;
        if (n1 < n2) {
            down1 = n1;
            up1 = n2;
        } else {
            down1 = n2;
            up1 = n1;
        }
        int n3 = down1 + (int) ((up1 - down1 + 1) * Math.random());
        int n4 = down1 + (int) ((up1 - down1 + 1) * Math.random());
        int n5 = down1 + (int) ((up1 - down1 + 1) * Math.random());
        System.out.println("Первое случайное число: " + n1);
        System.out.println("Первое случайное число: " + n2);
        System.out.println("Следующие три случайные положительные числа, между первым и вторым: ");
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
    }
}
