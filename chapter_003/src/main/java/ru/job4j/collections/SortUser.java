package ru.job4j.collections;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortUser  {



    public Set<User2> sort(List<User2> list) {
        Set<User2> tmp = new TreeSet<>();
      for (User2 user : list) {
          tmp.add(user);

      }
        System.out.println(tmp);
       return tmp;
    }


}
