package Chapter5;

//Задание 5.4
//        Дано логическое выражение:
//        (z>x)ll(x<O)&&(z-y>9)
//        Чему равно значение этого выражения для следующих значений переменных:
//        x=-2;y=5;z=13?
public class Ex5_4 {
    public static void main(String[] args) {
        int x = -2, y = 5, z = 13;
        System.out.println((z > x) || (x < 0) && (z - y > 9)); // true
    }
}
