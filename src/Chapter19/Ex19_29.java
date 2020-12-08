package Chapter19;

//Задание 19.29
//        Напишите метод, который принимает в качестве параметра массив
//        целых чисел М и два целых числа К и Т (номера ячеек массива).
//        Метод возвращает сумму значений, расположенных в ячейках массива
//        от ячейки номер К - до ячейки номер Т.
public class Ex19_29 {
    public static int foo(int[] array, int K, int T) {
        int result = 0;
        for (int i = K-1; i <= T-1; i++) {
            result += array[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(foo(array,3,5));
    }
}
