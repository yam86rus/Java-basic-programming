package Chapter17;

//Задание 17.17
//        Напишите метод, который получает в качестве параметра целое число
//        большее или равное 10. Метод возвращает число без его крайней левой
//        цифры.Например, для параметра 1234 метод вернет 234, а для параметра
//        104 -4.
public class Ex17_17 {
    static int firstNum(int a) {
        int number = a;
        int count = 0;
        while (a > 0) {
            count++;
            a /= 10;
        }
        return (int) (number % Math.pow(10, count - 1));
    }

    public static void main(String[] args) {
        System.out.println(firstNum(104));
    }
}
