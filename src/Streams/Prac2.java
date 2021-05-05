package Streams;

import java.util.*;

public class Prac2 {
    public static void main(String[] args) {
        int[] a = {1,1,1,2,2,3};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: a)
        {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        map.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).limit(2).forEach(System.out::println);
    }
}
