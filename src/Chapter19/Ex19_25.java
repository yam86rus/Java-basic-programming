package Chapter19;

//Задание 19.25
//        Напишите метод, который принимает в качестве параметра массив целых
//        чисел М и целое число Х и проверяет, встречается ли в массиве пара
//        расположенных в смежных ячейках чисел, сумма которых равна Х.
public class Ex19_25 {
    static boolean foo(int[] ar, int a) {
        boolean result = false;
        if (ar.length <= 1) {
            return result;
        } else {
            for (int i = 1; i <= ar.length - 1; i++) {
                if ((ar[i] + ar[i - 1]) == a) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(foo(array, 15));
    }
}
