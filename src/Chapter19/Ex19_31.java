package Chapter19;
//Задание 19.31
//        Напишите метод, который принимает в качестве параметра массив
//        целых чисел Ми целое число К (номер одной из ячеек массива).
//        Метод проверяет, являются ли элементы массива в ячейках от начальной
//        - до ячейки номер К упорядоченными по убыванию, и возвращает
//        соответствующее логическое значение.
public class Ex19_31 {
    static boolean foo(int[] array, int n){
        boolean result = true;

        for (int i=0; i<=n; i++){
            if(array[i]<array[i+1]){
                result = false;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a = {9,8,7,6,5,4,3,2,1};
        int b = 3;
        System.out.println(foo(a,b));
    }
}
