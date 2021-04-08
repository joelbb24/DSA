package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Frequencies {
    public static void main(String[] args) {
        int[] arr = {10,20,20,30,10};
        Map<Integer, Integer> map = new HashMap<>();

        for(int a: arr)
        {
            map.put(a, map.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            System.out.println(e.getKey()+" "+ e.getValue());x`
        }
    }
}
