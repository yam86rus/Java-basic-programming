package Chapter11;

//Задание 11.10
//        Напишите класс, который выводит на экран (в одну строку) 19 случайных
//        чисел из диапазона «однозначные числа». Каждое значение, равное
//        О, следует вывести на экран «В окружении» (вплотную к числу, перед
//        ним и после него) символов«%» (процент).
public class Ex11_10 {
    public static void main(String[] args) {
        int down = 0, up = 9;
        for (int i = 1; i <= 19; i++) {
            int a = down + (int) ((up - down + 1) * Math.random());
            String symbol = (a == 0) ? "%" : "";
            System.out.print(symbol + a + symbol + " ");
        }
    }

}
