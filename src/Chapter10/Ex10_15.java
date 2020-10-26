package Chapter10;

//Задание 10.15
//        Напишите класс, который генерирует и выводит на экран случайное
//        число из диапазона от 250 до 746, а затем в отдельных строках, - наименьшую
//        и наибольшую из цифр этого числа.
//        Класс также должен проверить, были ли в генерированном числе одинаковые
//        цифры, и вывести на экран соответствующее текстовое сообщение.
public class Ex10_15 {
    public static void main(String[] args) {
        int down = 250, up = 746;
        int a = down + (int) ((up - down + 1) * Math.random());
        System.out.println("Случано сгенерированное число " + a);
        int n1 = a / 100;
        int n2 = a / 10 % 10;
        int n3 = a % 10;
        int min = 0, max = 0;
        if (n1 >= n2 && n1 >= n3) max = n1;
        if (n2 >= n1 && n2 >= n3) max = n2;
        if (n3 >= n1 && n3 >= n1) max = n3;

        if (n1 <= n2 && n1 <= n3) min = n1;
        if (n2 <= n1 && n2 <= n3) min = n2;
        if (n3 <= n1 && n3 <= n1) min = n3;

        System.out.println("Максимальная цифра " + max);
        System.out.println("Минимальная цифра " + min);
        if (n1 == n2 || n2 == n3 || n1 == n3) System.out.println("В числе есть одинаковые цифры");
        else System.out.println("В числе нет одинаковый цифр");
    }
}
