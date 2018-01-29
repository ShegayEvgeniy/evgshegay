package ru.job4j.collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CollectionPerfomance {

    private String word;
    public static void main(String[] args) throws FileNotFoundException  {


       List<String> list = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        Set<String> list3 = new TreeSet<>();
        CollectionPerfomance col = new CollectionPerfomance();
        int amount = 300;
        long a = col.add(list,amount);
        System.out.println("Время добавления элементов в список типа ArrayList равно  " + a);
        long b = col.add(list2,amount);
        System.out.println("Время добавления элементов в список типа LinkedList равно  " + b);
        long c = col.add(list3,amount);
        System.out.println("Время добавления элементов в список типа TreeSet равно   " + c);
        long d =  col.delete(list,amount);
        long f = col.delete(list2,amount);
        long g = col.delete(list3,amount);
        System.out.println("Время удаления  разных по индексу элементов из Arraylist равно " + d);
        System.out.println("Время удаления  разных элементов из LinkedList равно " + f);
        System.out.println("Время удаления  разных элементов из TreeSet равно " + g);

    }

    public long add(Collection<String> collection , int amount) throws FileNotFoundException {
        long result = 0;
        File file = new File("text");
        Scanner scanner = new Scanner(file);
        long start=System.currentTimeMillis();
        while (scanner.hasNextLine() && amount > 0) {
            String s = scanner.nextLine();

            for (String a : s.split(" ")) {
                collection.add(a);
                amount--;
                word = a;
            }

        }
        long end=System.currentTimeMillis();
        result = end - start;
        scanner.close();

      return result;
    }


    public long delete(Collection<String> collection, int amount) {
     long result = 0;
     Iterator<String> iterator = collection.iterator();
     long start=System.currentTimeMillis();
     while( iterator.hasNext() && amount > 0) {
     collection.remove(word);
     amount--;
     }
     long end = System.currentTimeMillis();
     result = end - start;
     return result;
    }
}








