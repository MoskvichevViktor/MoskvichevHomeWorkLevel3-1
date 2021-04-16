package j3hw1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    //1. Написать метод, который меняет два элемента
    // массива местами.(массив может быть любого ссылочного типа);

    public static <T> void changeElements(T[] array, int a, int b) {
        T temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    //2. Написать метод, который преобразует массив в ArrayList;
    public  static <E> ArrayList<E> arToList(E[] array){
        ArrayList<E> arraylist = new ArrayList<E>();
        for(E i : array){
            arraylist.add(i);
        }
        return arraylist;
    }

    public static void main(String[] args){
        //Реализация метода из 1-го задания
        Integer[] intarray = {5, 6, 7, 8};
        String[] stringarray = {"a", "b", "c", "d"};

        changeElements(intarray, 0, 3);
        System.out.println(Arrays.toString(intarray));
        changeElements(stringarray, 0, 3);
        System.out.println(Arrays.toString(stringarray));

        //Реализация метода из 2-го задания
        System.out.println(arToList(intarray));
        System.out.println(arToList(stringarray));

    }
}
