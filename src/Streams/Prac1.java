package Streams;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Prac1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 10);
        map.put("b", 30);
        map.put("c", 50);
        map.put("d", 40);
        map.put("e", 100);
        map.put("f", 60);
        map.put("g", 110);
        map.put("h", 50);
        map.put("i", 90);
        map.put("k", 70);
        map.put("l", 80);

        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
}
