package Chapter10;

//Задание 10.11
//        Как известно, при игре в «двадцать одно» («очко») у каждой карты есть
//        численное значение.
//        Напишите класс, который «выбрасывает три карты» (генерирует три
//        случайных числа - в каких пределах?) и определяет, какой из вариантов
//        (недобор, перебор, «очко») реализовался.
public class Ex10_11 {
    public static void main(String[] args) {
        int down = 1, up = 11;
        int a = down + (int) ((up - down + 1) * Math.random());
        int b = down + (int) ((up - down + 1) * Math.random());
        int c = down + (int) ((up - down + 1) * Math.random());
        int summa = (a + b + c);
        System.out.println("Сумма трех случайных карт: " + summa);
        if (summa > 21) System.out.println("Перебор");
        if (summa == 21) System.out.println("Очко");
        if (summa < 21) System.out.println("Недобор");
    }
}
