package Chapter19;

//Задание 19.27
//        Напишите метод, который принимает в качестве параметра массив
//        целых чисел М и целое число К (номер одной из ячеек массива).
//        Метод возвращает сумму значений, расположенных в ячейках массива
//        от начальной - до ячейки номер К.
public class Ex19_27 {
    public static int foo(int[] array, int a) {
        int result = 0;
        for (int i = 0; i <= a; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(foo(array,9));
    }
}
