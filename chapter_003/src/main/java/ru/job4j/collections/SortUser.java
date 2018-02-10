package ru.job4j.collections;

import java.util.*;

public class SortUser  {



    public Set<User2> sort(List<User2> list) {
        Set<User2> tmp = new TreeSet<>();
      for (User2 user : list) {
          tmp.add(user);

      }
        System.out.println(tmp);
       return tmp;
    }

    public List<User2> sortNameLength(List<User2> list) {

        User2Comparator us = new User2Comparator();
        List<User2> tmp = new ArrayList<>();
          for (User2 user : list) {
              tmp.add(user);
          }
          Collections.sort(tmp, us);
          return tmp;
    }

    public List<User2> sortByAllFields(List<User2> list) {
        User2Comparator2 us2 = new User2Comparator2();
     List<User2> tmp = new ArrayList<>();
         for (User2 user2 : list) {
             tmp.add(user2);
         }
         Collections.sort(tmp, us2);
        return tmp;
    }

}
