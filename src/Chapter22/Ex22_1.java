package Chapter22;

//Задание 2 2 .1
//        Двумерный массив размером nxn (n - нечетное число) называется
//        центральным, если значения, находящиеся в его угловых ячейках,
//        равны значению в его центральной ячейке. Например:
public class Ex22_1 {
    static boolean foo(int[][] da) {
        boolean result = false;
        int center = da[da.length / 2][da.length / 2];
        if (    da[0][0] == center
                && da[0][da.length - 1] == center
                && da[da.length - 1][0] == center
                && da[da.length - 1][da.length - 1] == center) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] doubleArray1 = {{1, 2, 1}, {5, 1, 5}, {1, 2, 1}};
        System.out.println(foo(doubleArray1));
    }
}
