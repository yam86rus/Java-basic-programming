package Chapter14;

//Задание 14.3
//        Напишите класс, который генерирует серию из 50 случайных целых
//        чисел из диапазона от -40 до +40, и определяет наибольшее и наименьшее
//        значение в сгенерированной серии.
public class Ex14_3 {
    public static void main(String[] args) {
        int down = -40, up = 40;
        int a = down + (int) ((up - down + 1) * Math.random());
        int max = a, min = a;
        for (int i=1; i<=50; i++){
            int random = down + (int) ((up - down + 1) * Math.random());
            System.out.print(random + " ");
            if (random>max) max = random;
            if (random<min) min = random;
        }
        System.out.println();
        System.out.println("Максимальное число " + max);
        System.out.println("Минимальное число " + min);
    }
}
