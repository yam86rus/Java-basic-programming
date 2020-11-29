package Chapter16;

//Задание 16.4
//        Напишите класс, который выводит на экран построчно таблицу умножения: в первой строке
//        -умножение чисел от 1 до 9 на 1, во второй -
//        умножение на 2, и так далее до умножения чисел от 1 до 9 на 12.
public class Ex16_4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j<=9; j++){
                System.out.print(j*i + " ");
            }
            System.out.println();
        }
    }
}
