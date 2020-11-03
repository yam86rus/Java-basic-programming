package Chapter13;

//Задание 13.22
//        Трехзначное число называется «числом Армстронга», если куб суммы
//        цифр числа равен самому числу.
//        Напишите класс, который выводит на экран все трехзначные «числа
//        Армстронга».
//        Класс также должен подсчитывать (и выводить на экран с соответствующим
//        текстовым сообщением) количество и сумму этих чисел.
public class Ex13_22 {
    public static void main(String[] args) {
        int count = 0;
        int summ = 0;
        for (int i = 100; i <= 999; i++) {
            int n1 = i / 100;
            int n2 = i / 10 % 10;
            int n3 = i % 10;
            int n4 = n1 + n2 + n3;

            if (Math.pow(n4,3)==i){
                System.out.print(i + " ");
                count++;
                summ +=i;
            }
        }
        System.out.println();
        System.out.println("Количество " + count);
        System.out.println("Сумма " + summ);
    }
}
