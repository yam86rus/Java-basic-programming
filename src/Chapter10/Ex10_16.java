package Chapter10;

//Задание 10.16
//        Напишите класс, который генерирует и выводит на экран два случайных
//        числа из диапазона от 17 до 94.
//        Класс должен проверить, какое из двух чисел, первое или второе, было
//        больше, и вывести на экран соответствующее текстовое сообщение.
//        Кроме того, класс должен определить наименьшую цифру из всех фигурирующих
//        в этих числах и вывести на экран соответствующее текстовое
//        сообщение.
public class Ex10_16 {
    static int findMin(int... n) {
        int min, max, result = 100;

        for (int i = 0; i < n.length; i++) {
            if (n[i] / 10 < n[i] % 10) {
                min = n[i] / 10;
                max = n[i] % 10;
            } else {
                min = n[i] % 10;
                max = n[i] / 10;
            }
            if (min < result) {
                result = min;
            }
//            System.out.println("Минимальная цифра " + min);
//            System.out.println("Максимальная цифра " + max);
//            System.out.println("Итоговая минимальная цифра " + result);


        }
        return result;
    }

    public static void main(String[] args) {
        int down = 17, up = 94;
        int a = down + (int) ((up - down + 1) * Math.random());
        int b = down + (int) ((up - down + 1) * Math.random());
        System.out.println("Случаной сгенерированные числа: " + a + " и " + b);
        if (a > b) System.out.println("Первое число больше второго");
        if (a < b) System.out.println("Первое число меньше второго");
        if (a == b) System.out.println("Числа равны друг другу");
        System.out.println("Наименьшая цифра в этих числах: " + findMin(a, b));
    }
}
