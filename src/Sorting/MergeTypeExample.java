package Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class MergeTypeExample {
    public static void main(String[] args) {
        Integer[] arr = {5,20,10,3,12};
        Arrays.sort(arr, new MyCmp());
        System.out.println(Arrays.toString(arr));
    }
}

class MyCmp implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        return a%2 - b%2;
    }
}


//Graphs, Trees, LinkedList, Stacks and Queues, Arrays, Heaps