package Chapter15;

import java.util.Scanner;

public class Ex15_1 {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();

        while (a % b != 0) {
            a+=c;
            System.out.println(a + "; ");
        }

    }
}

//1. Постройте таблицу трассировки и укажите, что будет выведено
//        на экран, если с клавиатуры были введены следующие значения:
//        27, 7, 5.

// Будет выведено:
// 32
// 37
// 42

//2. Постройте таблицу трассировки и укажите, что будет выведено
//        на экран, если с клавиатуры были введены следующие значения:
//        20, 5, 8.

// Будет выведено:
// ничего на первой же проверки выполниться while

//3. Приведите пример значений, вводимых с клавиатуры, для которых
//        цикл в данном фрагменте не выполняется ни разу.
// деление без остатка любых чисел. Например 36, 6, x

//4. Есть ли значения переменных а, Ь, с, для которых цикл никогда не
//        завершится? Если да - приведите пример, если нет - объясните,
//        почему.
// 1 4 2

//5. Приведите пример значений, вводимых с клавиатуры, для которых
//        цикл в данном фрагменте будет выполняться ровно три раза.
//влом. Зато нашел 1 4 2 :p

//6. Что в общем случае выполняет приведенный фрагмент?
// Охлаждает воспаленный мозг автора / авторов данного шедевра. Но это не точно :)


