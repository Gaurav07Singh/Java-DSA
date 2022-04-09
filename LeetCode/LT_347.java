package kunalwstDSA.leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LT_347 {
    public static void main(String[] args) {
        /*
        Given an integer array nums and an integer k, return the k most frequent elements.
         You may return the answer in any order.
         Example 1:

        Input: nums = [1,1,1,2,2,3], k = 2
        Output: [1,2]
         */

        int[] arr = {1,1,1,2,2,3};
        int k = 1;
        System.out.println(Arrays.toString(topKFrequent(arr,k)));


    }
    public static int[] topKFrequent(int[] nums, int k) {
        //Count the number of occurrences of each number
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums)
            count.put(num, count.getOrDefault(num, 0) + 1);

        //max heap
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (int key : count.keySet())
            priorityQueue.add(new int[]{key, count.get(key)});

        //Take the largest k elements in the heap
        int[] res = new int[k];
        for (int i = 0; i < k; i++)
            res[i] = priorityQueue.poll()[0];
        return res;
    }
}
