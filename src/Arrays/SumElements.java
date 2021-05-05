package Arrays;
/*
Given an array of integers, return an array of integers which contains
[1st integer, Sum of next 2 integers (2nd, 3rd), Sum of next 3 integers (4th, 5th, 6th)]

Input size n
[1,6,8,5,9,4,7,2]
Output size m
[1,14,18,9]
 */


import java.util.ArrayList;
import java.util.List;

public class SumElements {
    public static void main(String[] args) {
        int[] input = {1, 6, 8, 5, 9, 4, 7, 2};
        List<Integer> res = new ArrayList<>();
        int bubbleSize = 1;
        int bubbleSum = 0;
        res.add(input[0]);
        for (int i = 1; i < input.length; i++) {
            bubbleSize++;
            bubbleSum = 0;
            for (int j = 0; j<bubbleSize; j++)
            {
                if(i== input.length)
                    break;

                bubbleSum = bubbleSum + input[i++];
            }
            res.add(bubbleSum);
            i--;
        }
        System.out.println(res);
    }
}
