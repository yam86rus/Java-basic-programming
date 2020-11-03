package Chapter13;

//Задание 13.21
//        Напишите класс, который выводит на экран все двузначные числа,
//        равные утроенному произведению его цифр.
//        Класс также должен подсчитывать (и выводить на экран с соответствующим
//        текстовым сообщением) количество и сумму этих чисел.
public class Ex13_21 {
    public static void main(String[] args) {
        int count = 0, summ = 0;
        for (int i = 10; i <= 99; i++) {
            int n1 = i / 10;
            int n2 = i % 10;
            int n3 = (n1 * n2) *3;
            if (i==n3) {
                System.out.print(i + " ");
                count++;
                summ +=i;
            }
        }
        System.out.println();
        System.out.println("Количество таких чисел " + count);
        System.out.println("Сумма таких чисел " + summ);
    }
}
