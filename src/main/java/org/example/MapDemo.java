package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {


        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"hello");
        map.put(3,"hello");
        map.put(6,"hello");
        map.put(2,"22321");

        Set set = map.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.println(mentry.getKey() + " " + mentry.getValue());
        }
        System.out.println();
        String var = map.get(2);
        map.remove(3);
        map.putIfAbsent(103,"Gauvar");
        Set set2 = map.entrySet();
        Iterator iterator1 = set2.iterator();

      while(iterator1.hasNext()){
          Map.Entry mentry2 = (Map.Entry)iterator1.next();
          System.out.println(mentry2.getKey() + " " + mentry2.getValue());
      }
    }
}
