package Chapter19;
//Задание 19.7
//        Напишите метод, который получает в качестве параметра массив и
//        заполняет его случайными числами в диапазоне О ... 99.
public class Ex19_7 {
    public static void random(int[] array){

        for (int i=0; i<array.length; i++){
            array[i]=(int)(Math.random()*100);
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int [] newArray = new int[10];
        random(newArray);
    }
}
