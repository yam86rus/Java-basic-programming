package Chapter19;

//Задание 19.63
//        Напишите метод, который принимает два параметра: массив целых
//        чисел и целое число К, указывающее на одну из ячеек массива (номер
//        ячейки). Метод возвращает сумму значений, содержащихся в массиве
//        от начала массива до ячейки К (не включая значение в ячейке номер К).
public class Ex19_63 {
    static int foo(int[] array, int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += array[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ar = {1, 2, 3, -4, -5, -6};
        int a = 4;
        System.out.println(foo(ar, a));
    }
}
