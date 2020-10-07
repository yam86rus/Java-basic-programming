package Chapter19;
//Задание 19.8
//        Напишите метод, который получает в качестве параметра массив и
//        заполняет его положительными случайными двузначными числами.
public class Ex19_8 {
    public static void randomGenerate(int[] array){
        for (int i=0; i<array.length; i++){
            array[i] = (int)(10+Math.random()*90);
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int[] newArray = new int[20];
        randomGenerate(newArray);
    }
}
