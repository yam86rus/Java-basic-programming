package Chapter10;

//Задание 10.20
//        Напишите класс, который генерирует и выводит на экран сначала случайное
//        положительное однозначное число (цифру), а затем - случайное
//        целое трехзначное.
//        Класс должен определить разницу между сгенерированной цифрой и
//        наибольшей цифрой сгенерированного случайного трехзначного числа.
public class Ex10_20 {
    public static void main(String[] args) {
        int down = 0, up = 9;
        int a = down + (int) ((up - down + 1) * Math.random());
        System.out.println("Сгенерировано случайное число от 0 до 10:   " + a);
        int down1 = 100, up1 = 999;
        int b = down1 + (int) ((up1 - down1 + 1) * Math.random());
        System.out.println("Сгенерировано случайное трехзначное число:    " + b);
        int n1 = b / 100;
        int n2 = b / 10 % 10;
        int n3 = b % 10;
        int[] array = {n1, n2, n3};
        int max = n1;
        for (int i:array){
            if (i>max) max = i;
        }
        System.out.println("Разница между самой большой цифрой в трехзначном числе " + b + " и цифрой " + a + " = " + Math.abs(a-max));
    }
}
