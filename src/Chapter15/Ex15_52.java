package Chapter15;

//Задание 15.52
//        Игра в кости проходит по следующим правилам: в каждом «круге» игры
//        два игрока бросают каждый по два кубика, на гранях которых - цифры
//        от 1до6. Игра заканчивается, если хотя бы один из победителей набрал
//        больше 100 очков. Если один из игроков набрал больше 100 очков, а
//        второй - нет, набравший более 100 объявляется победителем. Если оба
//        игрока набрали более 100 очков, объявляется ничья.
//        Напишите класс, реализующий модель этой игры и определяющий результат,
//        в соответствии с которым на экран выводится текстовое сообщение.
public class Ex15_52 {
    static int random() {
        int down = 1;
        int up = 6;
        int result = 0;
        for (int i = 0; i <= 1; i++) {
            int random = down + (int) ((up - down + 1) * Math.random());
            result += random;
        }
        return result;
    }

    public static void main(String[] args) {
        int scoreFirstPlayer = 0;
        int scoreSecondPlayer = 0;
        while (scoreFirstPlayer <= 100 || scoreSecondPlayer <= 100) {
            scoreFirstPlayer += random();
            scoreSecondPlayer += random();
        }
        System.out.println("Игра законена");
        System.out.println("Первый игрок " + scoreFirstPlayer);
        System.out.println("Второй игрок " + scoreSecondPlayer);
    }
}
