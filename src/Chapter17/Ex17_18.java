package Chapter17;

//Задание 17.18
//        Назовем «большим обменом» операцию, при которой два числа «обмениваются
//        » своими левыми цифрами.
//        1. Напишите класс, который принимает с клавиатуры два трехзначных
//        положительных числа и совершает над ними операцию «обмена».
//        2. Напишите класс, который принимает с клавиатуры два целых положительных
//        числа и совершает над ними операцию «обмена».
public class Ex17_18 {
//    static int firstNum(int a) {
//        int number = a;
//        int count = 0;
//        while (a > 0) {
//            count++;
//            a /= 10;
//        }
//        return (int) (number / Math.pow(10, count - 1));
//    }

    static int[] foo(int a, int b) {
        int[] result = new int[2];
        String s1 = "" + a;
        String s2 = "" + b;
        char c1 = s1.charAt(0);
        char c2 = s2.charAt(0);
        s1 = s1.replaceFirst("" + c1, "" + c2);
        s2 = s2.replaceFirst("" + c2, "" + c1);
        System.out.println(s1);
        System.out.println(s2);


        return result;
    }

    public static void main(String[] args) {
        foo(1234, 9856476);
    }
}
