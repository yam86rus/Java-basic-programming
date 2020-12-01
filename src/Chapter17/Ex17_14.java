package Chapter17;

//Задание 17.14
//        Напишите метод, который принимает в качестве параметра два целых
//        числа и возвращает среднее арифметическое сумм цифр в этих числах.
public class Ex17_14 {
    public double avr(int a, int b) {
        int a1 = 0;
        int counta1 = 0;
        while (a > 0) {
            a1 += a % 10;
            a /= 10;
            counta1++;
        }
        int b1 = 0;
        int countb1 = 0;
        while (b > 0) {
            b1 += b % 10;
            b /= 10;
            countb1++;
        }
        double resulta1 = a1 / counta1;
        double resultb1 = b1 / countb1;
        return ((resulta1 + resultb1) / 2);

    }

    public static void main(String[] args) {
        Ex17_14 test = new Ex17_14();
        double testResult = test.avr(123,456);
        System.out.println(testResult);
    }
}
