package Arrays.Medium;
//{ Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.lang.*;

class MaximumOfAllSubarraysOfSizeK {
    //best question***************************** Practice how many times you can deque and sliding window
    //Function to find maximum of each subarray of size k.
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        // ArrayList<Integer> result = new ArrayList<>();

        // for(int i = 0; i <= n - k; i++){
        //     int max = -1;
        //     for(int j = i; j < i+k; j++){
        //         max = Math.max(arr[j], max);
        //     }
        //     result.add(max);
        // }

        // return result;

        //optimized approach

        Deque<Integer> q = new ArrayDeque<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            //This is to check for that if window is > k. so we will remove till i-k
            while (!q.isEmpty() && q.getFirst() <= i - k) {
                q.removeFirst();
            }

            //This we will use to check if queue last element is smaller than current arr[i]
            while (!q.isEmpty() && arr[q.getLast()] < arr[i]) {
                q.removeLast();
            }

            //here we will add the element in queue.
            q.addLast(i);

            //here i got stuck that how we will decide that from here window is started and
            //we are good to add in our result list.
            if (i >= k - 1) {
                result.add(arr[q.getFirst()]);
            }
        }

        return result;

    }
}
