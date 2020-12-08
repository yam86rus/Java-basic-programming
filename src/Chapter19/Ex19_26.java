package Chapter19;

//Задание 19.26
//        Напишите метод, который принимает в качестве параметра массив
//        целых чисел М и целое число Х и проверяет, встречается ли в массиве
//        пара чисел, произведение которых равно Х (эти числа необязательно
//        расположены в смежных ячейках).
public class Ex19_26 {
    public static boolean foo(int[] array, int a) {
        boolean result = false;
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 0; j <= array.length - 1; j++) {
                if ((i * j) == a) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(foo(array, 9));
    }
}
