package ru.job4j.collections;

import java.util.ArrayList;
import java.util.List;

public class Convertation {

    List<Integer> list = new ArrayList<>();
    private int a = 0;
    private int j = 0;
    private int q = 0;
    private int z = 0;
    private int h = 0;
    private int m = 0;
    private int[][] tmp =  new  int[3][3];

    public List<Integer> toList(int[][] array) {
       for (int i = 0; i < array.length; i++) {
           for (int a : array[i]) {
               list.add(a);
           }
       }
       return list;
    }


    public int[][] toArray(List<Integer> test, int rows) {

        if (test.size() % rows == 0) {
                for (j = 0; j < tmp.length; j++) {
                    for (q = 0; q < tmp[j].length; q++) {
                        tmp[j][q] = returnValueFromList(test, z);
                        z++;
                    }
                }

        } else {
            if (test.size() % rows == 1) {
                for (j = 0; j < tmp.length; j++) {
                    for (q = 0; q < tmp[j].length; q++) {
                        tmp[j][q] = returnValueFromList(test, z);
                        z++;
                    }
                }
                }
            }
        return tmp;
    }


    public int returnValueFromList(List<Integer> test, int index) {

             if (index < test.size()) {
                 while (h < test.size()) {

                     m = test.get(h);
                     h++;
                    break;

                 }
             } else if (index >= test.size()) {
                  m = 0;
             }
        return m;
    }

}

