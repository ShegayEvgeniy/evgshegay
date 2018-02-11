package ru.job4j.collections;

import java.util.Comparator;
import java.util.List;

public class ListCompare implements Comparator<List<Integer>>  {

   private  int b = 0;
   private int j = 0;
   private  int result = 0;
   private  int i = 0;

    @Override
    public int compare(List<Integer> left, List<Integer> right) {

        if (left.size() == right.size()) {
            for (int a = 0; a < left.size(); a++) {
                i = left.get(a);
                    result = Integer.compare(i, simpleLoop(right));
                }
            }


           if (left.size() < right.size()) {
            int count = left.size();
            while (count > 0) {
                for (int a = 0; a < left.size(); a++) {
                    i = left.get(a);
                    count--;
                        result = Integer.compare(i, simpleLoop(right));
                    }
                }
            }

            int count2 = right.size() - left.size();
            while (count2 > 0) {
                i = -1;
                    result = Integer.compare(i, simpleLoop(right));
                    count2--;
                }
        return result;
    }


    public int simpleLoop(List<Integer> right) {
        while (b < right.size()) {
             j = right.get(b);
            b++;
            break;
        }
        return j;
    }
}
