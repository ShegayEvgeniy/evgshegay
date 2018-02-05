package ru.job4j.collections;

import java.util.ArrayList;
import java.util.List;

public class Convertation {




    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
       for (int i = 0; i < array.length; i++) {
           for (int a : array[i]) {
               list.add(a);
           }
       }
       return list;
    }


    public int[][] toArray(List<Integer> test, int rows) {

       int column = rows;
       int[][] result = new int[rows][column];
       int a = test.size();
       int count = 0;
       if (Math.ceil((double) a / (double) rows) == 3.0) {
           for (int i = 0; i < rows; i++) {

                   for (int j = 0; j < column; j++) {
                               result[i][j] = count(test, rows, a, count);
                               if (a >= 0) {
                                   a--;
                               }
                               count++;
                   }
               }
           }


        return result;
    }

    public int count(List<Integer> list, int rows, int a, int count) {
      int result = 0;
      if (list.size() % rows == 0) {
       result = list.get(count);
      count++;
      } else if (list.size() % rows == 1) {

          if (a > 0) {
              result = list.get(count);
          } else {
              result = 0;
          }
      }
      return result;
    }

    public List<Integer> convert(List<int[]> list) {
        List<Integer> result = new ArrayList<>();
        for (int[] tmp : list) {
            for (int i : tmp) {
                result.add(i);
            }
        }
        return result;
    }

}

