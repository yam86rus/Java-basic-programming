package Chapter21;
//Задание 21.13
//        Напишите метод, который получает в качестве параметра строку и возвращает
//        строку, составленную только из заглавных букв русского алфавита.
//        Например, для строки АБвrде 123ЖзИ метод возвратит АБЖИ.
public class Ex21_13 {
    static String foo(String s){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0; i<s.length(); i++){
            if (Character.isLetter(s.charAt(i)) && Character.isUpperCase(s.charAt(i))){
                stringBuilder.append(s.charAt(i));
            }
        }
        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        String s = "1АБвrде 123ЖзИ";
        String s1 = foo(s);
        System.out.println(s1);
    }
}
