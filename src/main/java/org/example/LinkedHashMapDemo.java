package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
        hm.put(100,"Amit");
        hm.put(102,"Vijay");
        hm.put(103,"Rahuk");

        for(Map.Entry m : hm.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
