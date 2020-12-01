package Chapter17;

//Задание 17.В
//        Напишите метод, который принимает в качестве параметра два целых
//        числа и возвращает значение true, если в числах одинаковое количество
//        цифр; в ином случае метод возвращает значение false.
public class Ex17_13 {
    static boolean foo(int a, int b) {
        int count1 = 0;
        int count2 = 0;
        while (a > 0) {
            count1++;
            a /= 10;
        }
        while (b > 0) {
            count2++;
            b /= 10;
        }
        return (count1 == count2) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(foo(123, 789));
        System.out.println(foo(123, 78));
        System.out.println(foo(123456, 789789));

    }
}
