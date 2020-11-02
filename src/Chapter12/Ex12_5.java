package Chapter12;

//Задание 12.5
//        Напишите класс, который генерирует 15 целых чисел в интервале от
//        -25 до 25, печатает их, а затем выводит на экран информацию о том,
//        сколько из них были:
//        • положительными;
//        • четными;
//        • однозначными.
public class Ex12_5 {
    public static void main(String[] args) {
        int down = -25, up = 25;
        int a = 0, b = 0, c = 0; //положительные, четные, однозначные
        for (int i = 1; i <= 15; i++) {
            int n = down + (int) ((up - down + 1) * Math.random());
            System.out.print(n + " ");
            if (n > 0) a++;
            if (n % 2 == 0) b++;
            if (n > 0 && n < 10) c++;
        }
        System.out.println();
        System.out.println("Положительные: " + a);
        System.out.println("Четные: " + b);
        System.out.println("Однозначные: " + c);
    }
}
