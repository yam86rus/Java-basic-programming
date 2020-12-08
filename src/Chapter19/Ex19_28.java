package Chapter19;
//Задание 19.28
//        Напишите метод, который принимает в качестве параметра массив
//        целых чисел М и целое число К (номер одной из ячеек массива).
//        Метод возвращает сумму значений, расположенных в ячейках массива
//        от ячейки номер К - до конца массива.
public class Ex19_28 {
    public static int foo(int[] array, int a) {
        int result = 0;
        for (int i = a-1; i <= array.length-1; i++) {
            result += array[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(foo(array,7));
    }
}
