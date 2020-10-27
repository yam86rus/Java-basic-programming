package Chapter10;


//Задание 10.18
//        Напишите класс, который генерирует и выводит на экран 3 случайных
//        целых положительных трехзначных числа.
//        Затем класс должен определить разницу между наибольшим и наименьшим
//        из сгенерированных чисел и вывести ее на экран вместе с
//        соответствующим текстовым сообщением.
public class Ex10_18 {
    public static void main(String[] args) {
        int down = 100, up = 999;
        int a = down + (int) ((up - down + 1) * Math.random());
        int b = down + (int) ((up - down + 1) * Math.random());
        int c = down + (int) ((up - down + 1) * Math.random());
        int[] array = {a, b, c};
        int max = array[0], min = array[0];
        System.out.println("Сгенерировано три случайных числа: " + a + " " + b + " " + c);
        for (int ar1 : array) {
            max = (ar1 > max) ? ar1 : max;
            min = (ar1 < min) ? ar1 : min;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Разница между самым большим и самым маленьким = " + (max - min));
    }
}
