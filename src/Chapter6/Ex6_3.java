package Chapter6;

import java.util.Scanner;

public class Ex6_3 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int age;
        System.out.println("Введите свой возраст");
        age = reader.nextInt();
        if (age > 18) System.out.println("Можешь участвовать в выборах");
        else System.out.println("Не можешь участвовать в выборах");
    }
}

//1. Что будет выведено на экран, если с клавиатуры введено значение 8?
//ничего не будет выведено

//2. Что будет выведено на экран, если с клавиатуры введено значение 19?
//"Можешь участвовать в выборах"

//3. Что будет выведено на экран, если с клавиатуры введено значение 18?
//ничего не будет выведено

//4. Приведите пример значения, которое надо ввести с клавиатуры,
//        чтобы на экран выводилось сообщение Можешь участвовать в
//        выборах.
//любое значение больше 18

//5. Приведите пример значения, которое надо ввести с клавиатуры,
//        чтобы на экран не выводилось сообщение Можешь участвовать
//        в выборах.
//18

//6. Как надо изменить код класса, чтобы кроме сообщения Можешь
//        участвовать в выборах выводилось на экран - в нужных случаях!
//        - сообщение Не можешь участвовать в выборах?
//        if (age > 18) System.out.println("Можешь участвовать в выборах");
//        else System.out.println("Не можешь участвовать в выборах");