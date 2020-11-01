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
        int a = 0; // положительное?
        int b = 0; // четное?
        int c = 0; //однозначное?
        for (int i = 1; i <= 15; i++) {
            int d = down + (int) ((up - down + 1) * Math.random());
            System.out.print(d + " ");
            if (d % 2 == 0) b++;
            if (d > 0) a++;
            if (d > 0 && d <= 9) c++;
        }
        System.out.println();
        System.out.println("Положительных " + a);
        System.out.println("Четных " + b);
        System.out.println("Однозначных " + c);
    }
}
