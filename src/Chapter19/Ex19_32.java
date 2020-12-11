package Chapter19;

//Задание 19.32
//        Напишите метод, который принимает в качестве параметра массив
//        целых чисел Ми два целых числа К и Т (номера ячеек массива).
//        Метод проверяет, являются ли элементы массива, расположенные в
//        нем от ячейки номер К - до ячейки номер Т, упорядоченными по убыванию,
//        и возвращает соответствующее логическое значение.
public class Ex19_32 {
    static boolean foo(int[] array, int n1, int n2) {
        boolean result = true;
        for (int i = n1; i <= n2 - 1; i++) {
            if (array[i] < array[i + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] a1 = {6, 5, 4, 3, 2, 1};
        int b = 0, c = 2;
        System.out.println(foo(a,b,c));
        System.out.println(foo(a1,b,c));

    }
}
