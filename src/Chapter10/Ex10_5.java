package Chapter10;

//Задание 10.5
//        Напишите класс, который генерирует случайное положительное двузначное
//        число, а затем генерирует три целых положительных числа,
//        меньших первого.
public class Ex10_5 {
    public static void main(String[] args) {
        int down = 10, up = 99;
        int n1 = down + (int) ((up - down + 1) * Math.random());
        int down1 = 1, up1 = n1-1;
        int n2 = down1 + (int) ((up1 - down1 + 1) * Math.random());
        int n3 = down1 + (int) ((up1 - down1 + 1) * Math.random());
        int n4 = down1 + (int) ((up1 - down1 + 1) * Math.random());
        System.out.println("Первое случайное число: " + n1);
        System.out.println("Следующие три случайные положительные числа, меньше первого: ");
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
    }
}
