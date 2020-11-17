package Chapter15;

//Задание 15.43
//        Наибольший общий делитель (НОД) двух целых положительных чисел
//        можно определить при помощи следующего метода: большее число
//        уменьшается на значение меньшего до тех пор, пока числа не оказываются равными.
//        Напишите класс, который принимает с клавиатуры два целых положительных
//        числа и определяет их НОД описанным методом.
public class Ex15_43 {
    static int abc(int a, int b) {
        int result = 0;
        int max = a, min = b;
        if (a > b) {
            max = a;
            min = b;
        } else if (a < b) {
            min = a;
            max = b;
        }

        while (max % min !=0){
            int n3 = max % min;
            max = min;
            min = n3;
            result = n3;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(abc(540, 24));
    }
}
