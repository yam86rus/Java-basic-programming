package Chapter10;
//Задание 10.6
//        Напишите класс, который генерирует случайное положительное двузначное
//        число, а затем генерирует три целых двузначных числа, не
//        меньших первого.
public class Ex10_6 {
    public static void main(String[] args) {
        int down = 10, up = 99;
        int n1 = down + (int) ((up - down + 1) * Math.random());
        int down1 = n1;
        int n2 = down1 + (int) ((up - down1 + 1) * Math.random());
        int n3 = down1 + (int) ((up - down1 + 1) * Math.random());
        int n4 = down1 + (int) ((up - down1 + 1) * Math.random());
        System.out.println("Первое случайное число: " + n1);
        System.out.println("Следующие три случайные положительные числа, не меньше первого: ");
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
    }
}
