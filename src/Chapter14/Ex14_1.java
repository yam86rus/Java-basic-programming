package Chapter14;

//Задание 14.1
//        В соревнованиях по бегу принимали участие 150 учеников школы.
//        Напишите класс, который принимает с клавиатуры время, показанное
//        в соревнованиях каждым из учеников, и выводит на экран наилучший
//        результат.
public class Ex14_1 {
    static int showInfo(int... i) {
        int bestScore = i[0];
        for (int n : i) {
            if (n < bestScore) bestScore = n;
        }
        return bestScore;
    }

    public static void main(String[] args) {
        System.out.println("Самый лучший результат " + showInfo(10, 20, 5,547,3));
    }
}
