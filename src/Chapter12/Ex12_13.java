package Chapter12;

//Задание 12.13
//        Для того чтобы проверить утверждение «орел и решка, при подбрасывании монеты,
//        выпадают примерно одинаковое количество раз», ученик подбросил монету сначала 10, потом 100, потом 1000 раз.
//        В каждой серии он записывал, сколько раз выпадала «решка», сколько - «орел».
//        Напишите класс, который моделирует эти три серии и для каждой подсчитывает количество выпадений «орла»
//        и количество выпадений
//        «решки», и выводит на экран абсолютное и относительное значение
//        разницы между этими количествами.
public class Ex12_13 {
    static int[] showInfo(int i) {
        System.out.println("Серия из " + i + " подбрасываний");
        int down = 0, up = 1; // диапазон
        int n1 = 0; // орел счетчик
        int n2 = 0; // решка счетчик
        for (int n = 1; n <= i; n++) {
            int random = down + (int) ((up - down + 1) * Math.random());
            System.out.print(random + " ");
            if (random == 0) n1++;
            if (random == 1) n2++;
        }
        int[] result = {n1, n2};
        System.out.println();
        System.out.println("Орел выпал " + result[0]);
        System.out.println("Решка выпал " + result[1]);
        return result;
    }

    public static void main(String[] args) {

        int[] firstTest = showInfo(10);
        int[] secondTest = showInfo(100);
        int[] thirdTest = showInfo(1000);

    }

}
